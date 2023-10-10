package com.student.sfa.compositekey;

import java.util.Objects;

public class CompositeKey {
	private int tid;
	private String std_regno;
	private int cal_year;
	private String section;
	private int year;
	private String sname;
	private String branch;
	
	
    public CompositeKey() {}
  
	public CompositeKey(int tid, String std_regno, int cal_year,String section, int year, String sname,
			String branch) {
		this.tid = tid;
		this.std_regno = std_regno;
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

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompositeKey that = (CompositeKey) o;
        return Objects.equals(tid, that.tid) &&
               Objects.equals(std_regno, that.std_regno) &&
               Objects.equals(cal_year, that.cal_year) &&
               Objects.equals(section, that.section) &&
               Objects.equals(year, that.year) &&
               Objects.equals(sname, that.sname) &&
               Objects.equals(branch, that.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tid, std_regno,cal_year,section,year,sname,branch);
    }
}
