package com.mongo.test.model;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Info {
	private Long contact;
	@Field("add")
	private String address;
	private LocalDate dob;
	private Boolean primaryInd;
}
