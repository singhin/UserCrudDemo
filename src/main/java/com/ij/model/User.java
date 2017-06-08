package com.ij.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;


@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;	
	
	@NotEmpty
	private String name;
	
	@NotNull
	private long dateOfBirthMillis;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDateOfBirthMillis() {
		return dateOfBirthMillis;
	}

	public void setDateOfBirthMillis(long dateOfBirthMillis) {
		this.dateOfBirthMillis = dateOfBirthMillis;
	}

 
}