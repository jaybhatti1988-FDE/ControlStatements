package com.java.fde.basiccontrol.staments.examples.twentythree;

import java.util.Scanner;

public class LoginAttempt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		final int MAX_ATTEMPTS=3;
		final String CORRECT_USER_NAME="Admin";
		final String CORRECT_USER_PASSWORD="Admin_1234";
		
		boolean loginSuccess=false;
		
		 System.out.println("╔══════════════════════════════════════════╗");
	     System.out.println("║          LOGIN ATTEMPT CHECK SYSTEM      ║");
	     System.out.println("╚══════════════════════════════════════════╝");

	     for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
			
	    	 System.out.println("\n------------------------------------------");
	         System.out.println("Attempt " + attempt + " of " + MAX_ATTEMPTS);
	         System.out.println("--------------------------------------------");
	         
	         System.out.println("Enter User Name");
	         String uName=sc.nextLine().trim();
	         
	         System.out.println("Enter User Password");
	         String uPWD=sc.nextLine().trim();
	         
	         if (uName.equals(CORRECT_USER_NAME)&& uPWD.equals(CORRECT_USER_PASSWORD)) {
				loginSuccess=true;
				System.out.println("LOGIN SUCCESSFUL! Welcome, " + uName + ".");
				break;
			} else {
				int remain=MAX_ATTEMPTS-attempt;
				if (remain>0) {
					System.out.println("Invalid Username or Password. Attempts remaining:" + remain);
				}
			}
		}
	     
	     if (!loginSuccess) {
	    	 System.out.println("\n------------------------------------------");
	    	 System.out.println("ACCESS DENIED: You have exceeded the maximum login attempts.");
	    	 System.out.println("Account temporarily locked. Please try again later.");
	         System.out.println("------------------------------------------");
		}
		
        System.out.println("------------------------------------------");
        System.out.println("     Thank you for Surffing with us!      ");
        System.out.println("------------------------------------------");
			sc.close();
		}
	}

