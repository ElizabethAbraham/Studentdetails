package com.revature.training.model;

public class StudentDetails {
	
	private int id;
	private String name;
	private String classpost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClasspost() {
		return classpost;
	}
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", classpost=" + classpost + "]";
	}
	public void setClasspost(String classpost) {
		this.classpost = classpost;
	}
	

}
