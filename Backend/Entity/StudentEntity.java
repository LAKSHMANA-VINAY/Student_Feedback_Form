package com.student.sfa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class StudentEntity {

	@Id
	@Column(name="std_regno")
	private String std_regno;
	
	@Column(name="std_name")
	private String std_name;
	
	@Column(name="std_email")
	private String std_email;
	
	@Column(name="std_dob")
	private String std_dob;
	
	@Column(name="std_pwd")
	private String std_pwd;
	
	@Column(name="std_year")
	private int std_year;
	
	@Column(name="std_branch")
	private String std_branch;
	
	@Column(name="std_section")
	private String std_section;
	
	@Column(name="year_of_join")
	private int year_of_join;
	
	@Column(name="std_sem")
	private String std_sem;
	
	@Column(name="cal_year")
	private int cal_year;

	public StudentEntity() {}

	public StudentEntity(String std_regno, String std_name, String std_email, String std_dob, String std_pwd,
			int std_year, String std_branch, String std_section, int year_of_join, String std_sem, int cal_year) {
		this.std_regno = std_regno;
		this.std_name = std_name;
		this.std_email = std_email;
		this.std_dob = std_dob;
		this.std_pwd = std_pwd;
		this.std_year = std_year;
		this.std_branch = std_branch;
		this.std_section = std_section;
		this.year_of_join = year_of_join;
		this.std_sem = std_sem;
		this.cal_year = cal_year;
	}

	public String getStd_regno() {
		return std_regno;
	}

	public void setStd_regno(String std_regno) {
		this.std_regno = std_regno;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public String getStd_email() {
		return std_email;
	}

	public void setStd_email(String std_email) {
		this.std_email = std_email;
	}

	public String getStd_dob() {
		return std_dob;
	}

	public void setStd_dob(String std_dob) {
		this.std_dob = std_dob;
	}

	public String getStd_pwd() {
		return std_pwd;
	}

	public void setStd_pwd(String std_pwd) {
		this.std_pwd = std_pwd;
	}

	public int getStd_year() {
		return std_year;
	}

	public void setStd_year(int std_year) {
		this.std_year = std_year;
	}

	public String getStd_branch() {
		return std_branch;
	}

	public void setStd_branch(String std_branch) {
		this.std_branch = std_branch;
	}

	public String getStd_section() {
		return std_section;
	}

	public void setStd_section(String std_section) {
		this.std_section = std_section;
	}

	public int getYear_of_join() {
		return year_of_join;
	}

	public void setYear_of_join(int year_of_join) {
		this.year_of_join = year_of_join;
	}

	public String getStd_sem() {
		return std_sem;
	}

	public void setStd_sem(String std_sem) {
		this.std_sem = std_sem;
	}

	public int getCal_year() {
		return cal_year;
	}

	public void setCal_year(int cal_year) {
		this.cal_year = cal_year;
	}
	
	
	
	
	
}
