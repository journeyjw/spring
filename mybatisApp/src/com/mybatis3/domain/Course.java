package com.mybatis3.domain;

import java.util.Date;
import java.util.List;
public class Course 
{
	private Integer courseId;
	private String name;
	private String description;
	private Date startDate;
	private Date endDate;
	private Tutor tutor;
	private List<Student> studentList;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(Integer courseId, String name, String description, Date startDate, Date endDate, Tutor tutor,
			List<Student> studentList) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.tutor = tutor;
		this.studentList = studentList;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Tutor getTutor() {
		return tutor;
	}
	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + ", description=" + description + ", startDate="
				+ startDate + ", endDate=" + endDate + ", tutor=" + tutor + ", studentList=" + studentList + "]";
	}
	
	
}
