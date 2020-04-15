package com.mongo.test.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "collection")
public class Customer {
	@Id
	private String id;
	@Field("test")
	private String primary;
	private Name name;
	private List<Info> info;
	

}
