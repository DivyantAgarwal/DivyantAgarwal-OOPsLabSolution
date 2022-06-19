package com.greatlearning.service;

import com.greatlearning.model.Employee;
import java.util.Random;

public class CredentialsService implements ICredentialsService{

	@Override
	public String generatePassword() {
		String capitalLetter = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String smallLetter = "qwertyuiopasdfghjklzxcvbnm";
		String numbers = "0123456789";
		String specialCharacters = ".,/';][";
		String value = capitalLetter + smallLetter + numbers + specialCharacters;
		
		StringBuffer strBuffer = new StringBuffer("");
		Random random = new Random();
		
		for (int index=0; index<8; index++) {
			strBuffer.append(value.charAt(random.nextInt(value.length())));
		}
		return strBuffer.toString();
	}

	@Override
	public String getEmailAddress(String firstName, String lastName, String department) {
		// TODO Auto-generated method stub
		return firstName+lastName+"@"+department+".com";
	}

	@Override
	public void showCredentials(Employee employee, String email, String generatePassword) {
		// TODO Auto-generated method stub
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows ");
		System.out.println("Email -> "+email);
		System.out.println("Password -> "+generatePassword);
		
	}
	
	

}
