package question_4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String name = sc.next();
		
		System.out.println("Enter password");
		String password = sc.next();
		
		System.out.println("Enter Mobile number");
		String mobile = sc.next();
		
		System.out.println("Enter email ID");
		String mail = sc.next();
		
		boolean validName =Pattern.matches("[a-zA-z]{3,8}", name);
		boolean validPass = Pattern.matches("[a-zA-z0-9]{3,8}", password);
		boolean validMobile = Pattern.matches("[6789]{1}[0-9]{9}", mobile);
		boolean validMail = Pattern.matches("^(.+)@(.+)$", mail);
		
		if(validName == true&&validPass==true&& validMobile==true&&validMail==true)
		{
			Customer c1 = new Customer(name, password, mobile, mail);
			System.out.println("Username : "+c1.getUsername());
			System.out.println("Password : "+c1.getPassword());
			System.out.println("Mobile : "+c1.getMobileNumber());
			System.out.println("Email id : "+ c1.getEmail());
		}
		else if(validName!=true) {
			System.out.println("Wrong Username!");
		}
		else if(validPass!=true) {
			System.out.println("Wrong Password!");
		}
		else if(validMobile!=true) {
			System.out.println("Wrong Mobile Nuumber!");
		}
		else if(validMail!=true) {
			System.out.println("Wrong Email id!");
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
