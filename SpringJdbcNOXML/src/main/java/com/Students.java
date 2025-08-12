package com;

public class Students {

	
	private int id;
	private String name;
	private String course;
	public Students() {
		super();
	}
	
	
	public Students(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}


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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
	
}
