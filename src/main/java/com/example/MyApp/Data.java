package com.example.MyApp;

public class Data {
	
	
	
	private String id;
	private String Student_name;
	
	
	public Data() {
		super();
	}


	public Data(String id, String student_name) {
		super();
		this.id = id;
		Student_name = student_name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getStudent_name() {
		return Student_name;
	}


	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	
	

}
