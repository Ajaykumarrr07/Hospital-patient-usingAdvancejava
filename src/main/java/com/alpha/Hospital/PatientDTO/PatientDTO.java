package com.alpha.Hospital.PatientDTO;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Positive;

public class PatientDTO {
	@Length(min=5, max=10)
	private String sname;
	@Positive
	private int age;
	@Length(min=5, max=10)
	private String dieasesase;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDieasesase() {
		return dieasesase;
	}
	public void setDieasesase(String dieasesase) {
		this.dieasesase = dieasesase;
	}
	public PatientDTO(String sname, int age, String dieasesase) {
		super();
		this.sname = sname;
		this.age = age;
		this.dieasesase = dieasesase;
	}
	public PatientDTO() {
		super();
	}
	@Override
	public String toString() {
		return "PatientDTO [sname=" + sname + ", age=" + age + ", dieasesase=" + dieasesase + "]";
	}
	

}
