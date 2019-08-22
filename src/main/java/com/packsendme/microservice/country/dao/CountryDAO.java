package com.packsendme.microservice.country.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.packsendme.microservice.country.repository.CountryModel;
import com.packsendme.microservice.country.repository.CountryRepository;


@Component("countryDAO")
public class CountryDAO implements ICountryMongo<CountryModel> {
	
	@Autowired
	CountryRepository countryRepository;

	@Override
	public CountryModel add(CountryModel entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CountryModel find(CountryModel account) {
		// TODO Auto-generated method stub
		return null;
	}
	
	 

	@Override
	public List<CountryModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(CountryModel entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CountryModel update(CountryModel entity) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
