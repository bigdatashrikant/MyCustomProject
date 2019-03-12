package com.test;

import atg.nucleus.GenericService;

public class SecondComponent extends GenericService {

	String name;
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
