package com.onebox.backend.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable{
	private static final long serialVersionUID = -4256711800099785778L;
	@Id
	private String user_ID;
	private String user_name;
	private String real_name;
	private Integer user_score;
	private String user_image;
	public User() {
		super();
	}
	public User(String user_ID, String user_name, String real_name, int user_score, String user_image) {
		super();
		this.user_ID = user_ID;
		this.user_name = user_name;
		this.real_name = real_name;
		this.user_score = user_score;
		this.user_image = user_image;
	}
	public String getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(String user_ID) {
		this.user_ID = user_ID;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getReal_name() {
		return real_name;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	public Integer getUser_score() {
		return user_score;
	}
	public void setUser_score(Integer user_score) {
		this.user_score = user_score;
	}
	public String getUser_image() {
		return user_image;
	}
	public void setUser_image(String user_image) {
		this.user_image = user_image;
	}
	@Override
	public String toString() {
		return "User [user_ID=" + user_ID + ", user_name=" + user_name + ", real_name=" + real_name + ", user_score="
				+ user_score + ", user_image=" + user_image + "]";
	}
	
}
