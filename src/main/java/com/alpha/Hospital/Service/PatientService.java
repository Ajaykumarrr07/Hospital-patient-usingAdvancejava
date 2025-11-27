package com.alpha.Hospital.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.Hospital.Entity.Patient;
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
	


}
