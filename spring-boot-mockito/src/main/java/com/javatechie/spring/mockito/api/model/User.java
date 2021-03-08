package com.javatechie.spring.mockito.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//import org.springframework.data.annotation.Id;


//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;


@Entity
public class User {
	@Id
	private int id;
	private String name;
	private int age;
	private String address;
	public User(int i, String string, int j, String string2) {
		// TODO Auto-generated constructor stub
		this.id=i;
		this.name=string;
		this.age=j;
		this.address=string2;
	}
	

}
