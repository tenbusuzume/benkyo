package com.tuyano.springboot;

import org.springframework.beans.factory.annotation.Autowired;

import com.tuyano.springboot.repositories.MyDataRepository;

public class MyDataBean {

	@Autowired
	MyDataRepository repository;

	public String getTableTagById(Long id) {
		MyData data = repository.findOne(id);
		String result = "<tr><td>" + data.getName() + "</td><td>"
				+ data.getMail() + "</td><td>" + data.getAge() + "</td><td>"
				+ data.getMemo() + "</td></tr>";
		return result;

	}
}
