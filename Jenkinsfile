pipeline {
    agent any

    environment {
        NAME_CONTAINER = "pcks-mobile-country-core"
        NAME_IMAGE = "pcks-mb-country-img:1"
        ID_CONTAINER = null 
        PORT_CONTAINER = "9095:9095"
        ENV_DEPLOY = "167.172.152.184"
        DIRECTORY + "/var/lib/jenkins/workspace/PackSendMe-EA/Domain-PCK/Mobile-PCKS/Microservice/Country-MS/country-pipeline-dev/target/"
    }

    stages {
        
        stage('Git Checkout Repositorio') {
            steps {
                git branch: 'develop',
                url: 'https://github.com/packsendme/pcks-mobile-country-core.git'
            }
        }
        stage('Java Build') {
          steps {
                sh 'mvn clean install'
              
            }
        }
        
        stage('Transfer Build') {
          steps {
                sh 'scp -r dist root@${ENV_DEPLOY}:${DIRECTORY}'
              	sh 'cd ${DIRECTORY}'
            }
        }
    
        stage("Docker Delopy - Check Container") {
            steps {
                script {
                    ID_CONTAINER = sh(script: "docker ps -a -f name=${NAME_CONTAINER} --format {{.ID}}", returnStdout: true).trim()
                    echo "Deploy PR #${ID_CONTAINER}"
                }
            }
        }
        
        stage("Docker Delopy  - Stop Container") {
           when { 
               allOf {
                        expression { ID_CONTAINER != null }
                        expression { ID_CONTAINER != "" }
               }
           }
            steps {
                script {
                    sh "docker stop ${ID_CONTAINER}"
                    sh "docker rm ${ID_CONTAINER}"
                    sh "docker rmi ${NAME_IMAGE}"
                }
            }
        }
        stage("Docker Delopy  - BuildAndRun Image") {
            steps {
                script {
                    sh "docker build . -t ${NAME_IMAGE}"
                    sh "docker run --name ${NAME_CONTAINER} -d -p ${PORT_CONTAINER} ${NAME_IMAGE}"
                }
            }
        }
        
    }
}