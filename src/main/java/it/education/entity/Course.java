package it.education.entity;

public class Course {
	private int course_id;
	private String course_name ;
	private String course_provider;
	private int course_duration;
	private int course_fees;
	
public Course() {
	// TODO Auto-generated constructor stub
}

public Course(int course_id, String course_name, String course_provider, int course_duration, int course_fees) {
	super();
	this.course_id = course_id;
	this.course_name = course_name;
	this.course_provider = course_provider;
	this.course_duration = course_duration;
	this.course_fees = course_fees;
}

public int getCourse_id() {
	return course_id;
}

public void setCourse_id(int course_id) {
	this.course_id = course_id;
}

public String getCourse_name() {
	return course_name;
}

public void setCourse_name(String course_name) {
	this.course_name = course_name;
}

public String getCourse_provider() {
	return course_provider;
}

public void setCourse_provider(String course_provider) {
	this.course_provider = course_provider;
}

public int getCourse_duration() {
	return course_duration;
}

public void setCourse_duration(int course_duration) {
	this.course_duration = course_duration;
}

public int getCourse_fees() {
	return course_fees;
}

public void setCourse_fees(int course_fees) {
	this.course_fees = course_fees;
}

@Override
public String toString() {
	return "Course [course_id=" + course_id + ", course_name=" + course_name + ", course_provider=" + course_provider
			+ ", course_duration=" + course_duration + ", course_fees=" + course_fees + "]";
}



}
