package com.alpha.Hospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.Hospital.ResponceStructure;
import com.alpha.Hospital.Entity.Patient;
import com.alpha.Hospital.Service.PatientService;

@RestController
public class DoctorController {
	@Autowired
	private PatientService ps;
	
	@PostMapping("/savepatient")
	public void savePatient(@RequestBody Patient s) {
		ps.savePatient(s);
		
	}
	
	
	@DeleteMapping("/delete")
	public void deletePatient(@RequestParam int id)
	{
		ps.deletePatient(id);
	}
	
	@GetMapping("/findptient")
	public ResponceStructure<Patient> findPatient(@RequestParam int id){
		return ps.findPatient(id);
	}
	@PutMapping("/update")
	public void updatePatient(@RequestParam int id,@RequestParam String newname) {
		ps.updatePatient(id,newname);
	}
	
	

}
