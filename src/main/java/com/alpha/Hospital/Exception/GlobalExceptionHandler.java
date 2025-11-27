package com.alpha.Hospital.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.alpha.Hospital.ResponceStructure;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(PatientNotFoundException.class)
	public ResponceStructure<String>  patientNotFoundExhandller(){
		 ResponceStructure<String> rs=new  ResponceStructure<String>();
		 rs.setStatusCode(HttpStatus.FOUND.value());
			rs.setMessage("Patient Not Found");
			rs.setData("Patient Not Found");
			return rs;
	}
	

}
