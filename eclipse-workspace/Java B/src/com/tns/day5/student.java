package com.tns.day5;

public class student extends citizen {

	private int rollNo;
	private String collegeName;
	public student () {
		
	}
	
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "student [rollNo=" + rollNo + ", collegeName=" + collegeName + "]";
	}
	

	}


