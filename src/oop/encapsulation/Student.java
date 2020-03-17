package oop.encapsulation;

public class Student {
	private String stName;
	private int stId;
	private String grade;
	private String DOB;
	
	public Student() {}
	public Student(String stName, int stId, String grade, String dOB) {
		this.stName = stName;
		this.stId = stId;
		this.grade = grade;
		this.DOB = dOB;
	}
	
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
}	
