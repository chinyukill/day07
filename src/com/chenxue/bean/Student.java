package com.chenxue.bean;

public class Student {

	private int sid;
	private String snameString;
	public Student(int sid, String snameString) {
		super();
		this.sid = sid;
		this.snameString = snameString;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSnameString() {
		return snameString;
	}
	public void setSnameString(String snameString) {
		this.snameString = snameString;
	}
	
	
}
