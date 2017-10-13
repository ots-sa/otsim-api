package com.ots.otsim.api.model.json;

import java.io.Serializable;

public class ChatRoom implements Serializable {
	
	private static final long serialVersionUID = 7257158482393173143L;
	private String name;
	
	public ChatRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChatRoom(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
