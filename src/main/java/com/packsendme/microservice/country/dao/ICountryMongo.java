package com.packsendme.microservice.country.dao;

import java.util.List;


public interface ICountryMongo<T> {

	public T add(T entity);

	public T find(T account);
	
	public List<T> findAll();
	
	public void remove(T entity);
	
	public T update(T entity);
	
	
		

}
