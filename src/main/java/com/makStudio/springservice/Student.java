package com.makStudio.springservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="student_id")
	 private int id;
	@Column(name="student_name")
	 private String studentName;
	public int getStudentId() {
		return id;
	}
	public void setStudentId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
