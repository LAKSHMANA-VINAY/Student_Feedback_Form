package com.student.sfa.entity;
import com.student.sfa.compositekey.CompositeKey;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name="feedback")
@IdClass(CompositeKey.class)
public class FeedBackEntity {
	
	@Id
	@Column(name="tid")
	private int tid;
	
	@Id
	@Column(name="std_regno")
	private String std_regno;
	
	@Column(name="q1")
	private int q1;
	
	@Column(name="q2")
	private int q2;
	
	@Column(name="q3")
	private int q3;
	
	@Column(name="q4")
	private int q4;
	
	@Column(name="q5")
	private int q5;
	
	@Column(name="comments")
	private String comments;
	
	@Id
	@Column(name="cal_year")
	private int cal_year;
	
	@Id
	@Column(name="std_section")
	private String section;
	
	@Id
	@Column(name="std_year")
	private int year;
	
	@Id
	@Column(name="sname")
	private String sname;
	
	@Id
	@Column(name="std_branch")
	private String branch;

	public FeedBackEntity() {}

	public FeedBackEntity(int tid, String std_regno, int q1, int q2, int q3, int q4, int q5, String comments,
			int cal_year,String section, int year, String sname, String branch) {
		this.tid = tid;
		this.std_regno = std_regno;
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.q4 = q4;
		this.q5 = q5;
		this.comments = comments;
		this.cal_year = cal_year;
		this.section = section;
		this.year = year;
		this.sname = sname;
		this.branch = branch;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getStd_regno() {
		return std_regno;
	}

	public void setStd_regno(String std_regno) {
		this.std_regno = std_regno;
	}

	public int getQ1() {
		return q1;
	}

	public void setQ1(int q1) {
		this.q1 = q1;
	}

	public int getQ2() {
		return q2;
	}

	public void setQ2(int q2) {
		this.q2 = q2;
	}

	public int getQ3() {
		return q3;
	}

	public void setQ3(int q3) {
		this.q3 = q3;
	}

	public int getQ4() {
		return q4;
	}

	public void setQ4(int q4) {
		this.q4 = q4;
	}

	public int getQ5() {
		return q5;
	}

	public void setQ5(int q5) {
		this.q5 = q5;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getCal_year() {
		return cal_year;
	}

	public void setCal_year(int cal_year) {
		this.cal_year = cal_year;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
}
