package com.ots.otsim.api.model.json;

import java.io.Serializable;

public class ChatMessage implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1567877081990496738L;
	private String id;
	private String text;
	private String userId;
	private String userName;
	private String avatar;
	private String date;
	
	
	public ChatMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChatMessage(String id, String text, String userId, String userName, String avatar, String date) {
		super();
		this.id = id;
		this.text = text;
		this.userId = userId;
		this.userName = userName;
		this.avatar = avatar;
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
