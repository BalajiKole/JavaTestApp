package com.demo.springMvc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//@JsonPropertyOrder({"studentIdentifier","name"})
//@JsonIgnoreProperties({"name"})
public class Student {
@JsonProperty("studentIdentifier")
private int studentId;
@JsonProperty("name")
private String studentName;
public Student(int studentId, String studentName) {
	this.studentId = studentId;
	this.studentName = studentName;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}

}
