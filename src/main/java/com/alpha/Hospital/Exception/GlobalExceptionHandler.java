package com.alpha.Hospital.Exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponceStructure<Map<String, String>> handledMethodArgumentNotValid(MethodArgumentNotValidException ex){
		
		Map<String, String> errormap = new HashMap<String , String>();
		
		List<ObjectError> objerror=ex.getAllErrors();
		
		for(ObjectError objectError : objerror) {
			System.out.println(objectError.getDefaultMessage());;
			
			FieldError fr = (FieldError) objectError;
			System.out.println(fr.getField());
			
			errormap.put(fr.getField(), objectError.getDefaultMessage());
		}
		
		ResponceStructure<Map<String, String>> rs = new ResponceStructure<Map<String, String>>();
		
		 rs.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
		 rs.setMessage("VALIDATION FAILED");
		 rs.setData(errormap);
		return rs;
	}

}
