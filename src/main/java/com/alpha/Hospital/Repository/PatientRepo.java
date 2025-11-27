package com.alpha.Hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.Hospital.Entity.Patient;

@Repository
public interface PatientRepo  extends JpaRepository<Patient, Integer>{

}

