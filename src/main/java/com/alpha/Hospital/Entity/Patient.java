package com.alpha.Hospital.Entity;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Positive;

@Entity
public class Patient {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	
	private String sname;

	private String dieasesase;
	
	private int age;
	private String bggroup;
	private int bg;
	private int sugarlevel;
	
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBggroup() {
		return bggroup;
	}
	public void setBggroup(String bggroup) {
		this.bggroup = bggroup;
	}
	public int getBg() {
		return bg;
	}
	public void setBg(int bg) {
		this.bg = bg;
	}
	public int getSugarlevel() {
		return sugarlevel;
	}
	public void setSugarlevel(int sugarlevel) {
		this.sugarlevel = sugarlevel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDieasesase() {
		return dieasesase;
	}
	public void setDieasesase(String dieasesase) {
		this.dieasesase = dieasesase;
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", sname=" + sname + ", dieasesase=" + dieasesase + ", age=" + age + ", bggroup="
				+ bggroup + ", bg=" + bg + ", sugarlevel=" + sugarlevel + "]";
	}

	public Patient(int id, @Length(min = 5, max = 10) String sname, @Length(min = 5, max = 10) String dieasesase,
			@Positive int age, String bggroup, int bg, int sugarlevel) {
		super();
		this.id = id;
		this.sname = sname;
		this.dieasesase = dieasesase;
		this.age = age;
		this.bggroup = bggroup;
		this.bg = bg;
		this.sugarlevel = sugarlevel;
	}
	public Patient() {
		super();
	}
	
	
	

}
