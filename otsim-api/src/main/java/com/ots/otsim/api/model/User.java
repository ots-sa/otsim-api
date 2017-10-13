package com.ots.otsim.api.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Access(AccessType.FIELD)
@Table(name="users")
public class User implements Serializable{
	
	private static final long serialVersionUID = -6150647017693044610L;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "first_name")	
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "application_name")
	private String applicationName;
	@Column(name = "rocket_token")
	private String rocketToken;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public String getRocketToken() {
		return rocketToken;
	}
	public void setRocketToken(String rocketToken) {
		this.rocketToken = rocketToken;
	}
	
	
}
