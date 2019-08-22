package com.packsendme.microservice.country.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface CountryRepository extends MongoRepository<CountryModel, String>   {
	
	@Query("{'codcountry' :  {$eq: ?0}}")
	List<CountryModel> findCountryByCodNumber(String codNumber);


}