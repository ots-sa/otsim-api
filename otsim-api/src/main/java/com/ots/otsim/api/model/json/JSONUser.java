package com.ots.otsim.api.model.json;

import java.io.Serializable;

import com.ots.otsim.api.model.User;

public class JSONUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7270945750716809578L;
	private Long id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String applicationName;
	private String rocketToken;
	
	public JSONUser(User user) {
		this.id = user.getId();
		this.username = user.getUsername();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.applicationName = user.getApplicationName();
		this.rocketToken =user.getRocketToken();
	}
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
