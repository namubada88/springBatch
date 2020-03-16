package com.springBatch.main;

import java.io.Serializable;

public class UserRegistration implements Serializable {

    private static final long serialVersionUID = 1L;

    private int num;
    private String subject;
    private String image_name;
    
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getImage_name() {
		return image_name;
	}
	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "UserRegistration [num=" + num + ", subject=" + subject + ", image_name=" + image_name + "]";
	}
    
    
	
}
