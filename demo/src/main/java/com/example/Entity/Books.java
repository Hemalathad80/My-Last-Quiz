package com.example.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Books {

	String name;

	public Books(@JsonProperty("name") String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
