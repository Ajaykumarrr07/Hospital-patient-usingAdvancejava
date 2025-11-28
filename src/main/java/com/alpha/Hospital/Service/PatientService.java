package com.alpha.Hospital.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.alpha.Hospital.ResponceStructure;
import com.alpha.Hospital.Entity.Doctor;
import com.alpha.Hospital.Entity.Patient;
import com.alpha.Hospital.Entity.PatientDTO;
import com.alpha.Hospital.Exception.PatientNotFoundException;
import com.alpha.Hospital.Repository.DoctorRepo;
import com.alpha.Hospital.Repository.PatientRepo;
@Service
public class PatientService {
	@Autowired
	private DoctorRepo dr;
	
@Autowired
	private PatientRepo pr;
	
	public void savePatient(Patient s) {
		pr.save(s);
		
	}

	public void deletePatient(int id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
		
	}

	public ResponceStructure<Patient> findPatient(int id) {
		// TODO Auto-generated method stub
		
		Patient p=pr.findById(id).orElseThrow(()->new PatientNotFoundException());
		ResponceStructure<Patient> rs=new ResponceStructure<Patient>();
		rs.setStatusCode(HttpStatus.FOUND.value());
		rs.setMessage("Patient With Id "+id+"Found");
		rs.setData(p);
		return rs;
	}
	
	
	
	

	public void updatePatient(int id, String newname) {
		// TODO Auto-generated method stub
		Patient p=pr.findById(id).get();
		p.setSname(newname);
		pr.save(p);
		
	}

	public void saveDoctorPatient(Doctor c) {
		// TODO Auto-generated method stub
		
		dr.save(c);
		
	}

	
	


}
