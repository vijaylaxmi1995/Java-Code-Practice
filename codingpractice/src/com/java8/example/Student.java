package com.java8.example;

public class Student {

	 private String sname;
	 private Integer sid;
	public Student() {
  
	}
	
	public Student(String sname,Integer sid) {
		this.sname=sname;
		this.sid=sid;
		  
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}
	
	

}
