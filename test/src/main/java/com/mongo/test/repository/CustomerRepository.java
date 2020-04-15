package com.mongo.test.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.test.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>{
	
	public List<Customer> findByPrimary(String primary);
	
	public List<Customer> findByName_LastName(String name);
	
	public List<Customer> findByInfo_Contact(Long contact);	

}
