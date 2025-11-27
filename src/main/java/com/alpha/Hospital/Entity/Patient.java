package com.alpha.Hospital.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {
	@Id
	private int id;
	private String sname;
	private String dieasesase;
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
		return "Patient [id=" + id + ", sname=" + sname + ", dieasesase=" + dieasesase + "]";
	}
	public Patient(int id, String sname, String dieasesase) {
		super();
		this.id = id;
		this.sname = sname;
		this.dieasesase = dieasesase;
	}
	public Patient() {
		super();
	}
	
	
	

}
