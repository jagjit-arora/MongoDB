package com.mongo.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.test.model.Customer;
import com.mongo.test.service.Service;

@RestController
public class Controller {
	@Autowired
	private Service service;
	
	@GetMapping("/get")
	public List<Customer> getUsingPrimary(@RequestParam String primary){
		return service.getByPrimary(primary);
	}
	
	@GetMapping("/insert")
	public void insertRecord(@RequestParam String primary) {
		service.saveData(primary);
	}
	
	@GetMapping("/lname")
	public List<Customer> getUsingLastname(@RequestParam String primary) {
		return service.getByLastName(primary);
	}

	@GetMapping("/contact")
	public List<Customer> getUsingContact(@RequestParam long primary) {
		return service.getByContact(primary);
	}
}
