package com.student.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//marking class name as an Entity
@Entity
//Defining class name as a table name
@Table
public class Student {
	//defining id as a primary key
	@Id
	@Column
	private int studentid;
	@Column
	private String studentname;
	@Column
	private String studentaddress;
	@Column
	private String major;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}	
}
