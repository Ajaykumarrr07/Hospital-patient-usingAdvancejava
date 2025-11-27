package com.alpha.Hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.Hospital.Entity.Doctor;

public interface DoctorRepo  extends JpaRepository<Doctor, Integer>{

}
