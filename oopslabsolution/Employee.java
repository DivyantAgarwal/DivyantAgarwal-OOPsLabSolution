package oopslabsolution;

import java.util.Scanner;
import java.lang.Math;

public class Employee {
//	public String firstName;
//	public String lastName;
	public int department;
	public String email, password;
	public final String company = "robo4me";
	public String[] name = {"", ""};
	
	Scanner sc = new Scanner(System.in);
	
	Employee(String firstName, String lastName) {
		name[0] = firstName;
		name[1] = lastName;
	}
	
	public int getDepartment() {
		System.out.println("Please enter the department :\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
		department = sc.nextInt();
		return department;
	}
	
	public String generatePassword(String small_letter, String capital_letter, String number, String special_char) {
		int max_letter = small_letter.length();
		int max_number = number.length();
		int max_char = special_char.length();
		int min = 1;
		String password = number.charAt(randomInt(max_number-1, min))+""+
		number.charAt(randomInt(max_number-1, min))+""+
				number.charAt(randomInt(max_number-1, min))+""+
		capital_letter.charAt(randomInt(max_letter-1, min))+""+
				special_char.charAt(randomInt(max_char-1, min))+""+
		small_letter.charAt(randomInt(max_letter-1, min))+""+
				capital_letter.charAt(randomInt(max_letter-1, min))+""+
		capital_letter.charAt(randomInt(max_letter-1, min));
		return password;
	}
	
	public int randomInt(int max, int min) {
		return (min + (int)(Math.random()* ((max - min) + 1)));
	}
	
	public String generateEmailAddress(String firstName, String lastName, int department, String company) {
		String dep = null;
		if (department==1) {
			dep = "tech";
		}
		else if(department==2) {
			dep = "admin";
		}
		else if(department==3) {
			dep = "hr";
		}
		else if(department==4) {
			dep = "legal";
		}
		String email = firstName.toLowerCase()+lastName.toLowerCase()+"@"+dep+"."+company+".com";
		return email;
	}
	
	public void showCredentials() {
		department = getDepartment();
		email = generateEmailAddress(name[0], name[1], department, company);
		password = generatePassword("abcdefghijklmnopqrstuvwxyz", 
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "0123456789", "!@#$%&*()_+-=[]|,./?><");
		
		System.out.println("Dear "+name[0]+" "+name[1]+" your generated credentials are as follows:");
		System.out.println("Email ID :"+email);
		System.out.println("Password :"+password);
		
	}
	
	
	public static void main(String[] args) {
		Employee employee = new Employee("Divyant", "Agarwal");
		employee.showCredentials();
	}
}
