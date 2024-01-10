package com.institute.bean;

import javax.validation.constraints.NotEmpty;

public class CollegeBean {
	
private Long id;
@NotEmpty(message="Name is required")
 private String name;
@NotEmpty(message="count is required")
 private Integer count;
@NotEmpty(message="code is required")
 private String code;
@NotEmpty(message="faculty is required")
 private String faculty;
@NotEmpty(message="crediteddate is required")
 private String createdDate;
 
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getFaculty() {
	return faculty;
}
public void setFaculty(String faculty) {
	this.faculty = faculty;
}
public String getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(String createdDate) {
	this.createdDate = createdDate;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getCount() {
	return count;
}
public void setCount(Integer count) {
	this.count = count;
}
@Override
public String toString() {
	return "CollegeBean [id=" + id + ", name=" + name + ", count=" + count + ", code=" + code + ", faculty=" + faculty
			+ ", createdDate=" + createdDate + "]";
}
 
}
