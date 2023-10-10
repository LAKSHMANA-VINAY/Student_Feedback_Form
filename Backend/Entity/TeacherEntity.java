package com.student.sfa.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="teacher")
@Entity
public class TeacherEntity {

	@Id
	@Column(name="tid")
	private int tid;
	@Column(name="tname")
	private String tname;
	@Column(name="rating")
	private int rating;
	@Column(name="specialization")
	private String specialization;
	@Column(name="branch")
	private String branch;
	public TeacherEntity() {}
	public TeacherEntity(int tid, String tname, int rating, String specialization, String branch) {
		this.tid = tid;
		this.tname = tname;
		this.rating = rating;
		this.specialization = specialization;
		this.branch = branch;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}
