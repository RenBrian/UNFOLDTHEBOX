package com.onebox.backend.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="o_uuser")
public class UUser implements Serializable{
	
	  
	/**  
	 * @Fields field:field:{todo}
	 */  
	
	private static final long serialVersionUID = -7066377556988053621L;
	@Id
	private String uuser_ID;
	//hash加密一下
	private String uuser_psw;
	private String uuser_name;
	private String uuser_email;
	private String uuser_image;
	
	
	public UUser(String uuser_psw, String uuser_name, String uuser_email, String uuser_image) {
		super();
		this.uuser_psw = uuser_psw;
		this.uuser_name = uuser_name;
		this.uuser_email = uuser_email;
		this.uuser_image = uuser_image;
	}


	public UUser(String uuser_ID, String uuser_psw, String uuser_name, String uuser_email, String uuser_image) {
		super();
		this.uuser_ID = uuser_ID;
		this.uuser_psw = uuser_psw;
		this.uuser_name = uuser_name;
		this.uuser_email = uuser_email;
		this.uuser_image = uuser_image;
	}


	public String getUuser_ID() {
		return uuser_ID;
	}


	public void setUuser_ID(String uuser_ID) {
		this.uuser_ID = uuser_ID;
	}


	public String getUuser_psw() {
		return uuser_psw;
	}


	public void setUuser_psw(String uuser_psw) {
		this.uuser_psw = uuser_psw;
	}


	public String getUuser_name() {
		return uuser_name;
	}


	public void setUuser_name(String uuser_name) {
		this.uuser_name = uuser_name;
	}


	public String getUuser_email() {
		return uuser_email;
	}


	public void setUuser_email(String uuser_email) {
		this.uuser_email = uuser_email;
	}


	public String getUuser_image() {
		return uuser_image;
	}


	public void setUuser_image(String uuser_image) {
		this.uuser_image = uuser_image;
	}


	@Override
	public String toString() {
		return "UUser [uuser_ID=" + uuser_ID + ", uuser_psw=" + uuser_psw + ", uuser_name=" + uuser_name
				+ ", uuser_email=" + uuser_email + ", uuser_image=" + uuser_image + "]";
	}
	

}
