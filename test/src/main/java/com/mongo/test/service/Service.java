package com.mongo.test.service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.SerializationUtils;

import com.mongo.test.model.Customer;
import com.mongo.test.model.Info;
import com.mongo.test.model.Name;
import com.mongo.test.repository.CustomerRepository;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customer> getByPrimary(String primary) {
		return customerRepository.findByPrimary(primary);
	}
	
	public List<Customer> getByLastName(String lastName) {
		return customerRepository.findByName_LastName(lastName);
	}
	
	public List<Customer> getByContact(Long contact) {
		return customerRepository.findByInfo_Contact(contact);
	}
	
	public void saveData(String primary) {
		Customer c=new Customer();
		c.setId(primary);
		Name name=new Name();
		name.setFirstName("firstName");
		name.setLastName("LastName");
		c.setName(name);
		Info info=new Info();
		info.setAddress("snasfshfjaski");
		info.setContact(8888585888L);
		info.setDob(LocalDate.now());
		info.setPrimaryInd(true);
		Info x=new Info();
		x.setContact(99999996655L);
		c.setInfo(Arrays.asList(info,x));
		c.setPrimary(primary);
		System.out.println(c.toString());
		customerRepository.save(c);
	}
	

}