package com.greatlearning.driver;

import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialsService;

public class DriverClass {
	private static final CredentialsService credentialservice = new CredentialsService();
	private static final Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
		Employee employee = new Employee("Divyant", "Agarwal");
		String generatedEmail;
		String generatedPassword;
		
		System.out.println("Please enter the department");
		
		int departmentNumber = sc.nextInt();
		
		switch(departmentNumber)
		{
		case 1:
		{
			generatedPassword = credentialservice.generatePassword();
			generatedEmail = credentialservice.getEmailAddress("Divyant", "Agarwal", "technical");
			credentialservice.showCredentials(employee, generatedEmail, generatedPassword);
		}
		break;
		case 2:
		{
			generatedPassword = credentialservice.generatePassword();
			generatedEmail = credentialservice.getEmailAddress("Divyant", "Agarwal", "hr");
			credentialservice.showCredentials(employee, generatedEmail, generatedPassword);
		}
		break;
		case 3:
		{
			generatedPassword = credentialservice.generatePassword();
			generatedEmail = credentialservice.getEmailAddress("Divyant", "Agarwal", "technical");
			credentialservice.showCredentials(employee, generatedEmail, generatedPassword);
		}
		break;
		case 4:
		{
			generatedPassword = credentialservice.generatePassword();
			generatedEmail = credentialservice.getEmailAddress("Divyant", "Agarwal", "legal");
			credentialservice.showCredentials(employee, generatedEmail, generatedPassword);
		}
		break;
		}
	}
	
}
