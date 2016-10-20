package com.bitwise.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "STUDENT_INFO")
public class StudentDetail {
	@Id
	@GeneratedValue(generator="newGenerator")
	@GenericGenerator(name="newGenerator", strategy = "foreign", parameters={@Parameter(name = "property", value = "student")})
	private int rollNo;
	private int mobileNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="rollNo")
	private Student student;

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
