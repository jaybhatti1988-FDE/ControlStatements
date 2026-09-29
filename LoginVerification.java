package com.java.fde.basiccontrol.staments.examples.two;

import java.util.Scanner;

public class LoginVerification {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      LOGIN CHECK SYSTEM                  ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // --- Input ---
        String storedPwd = "Admin_1234";
        
        System.out.print("Enter User Name        :- ");
        String usrName = sc.nextLine();

        System.out.print("Enter your Password   :- ");
        String pwd = sc.nextLine();

        System.out.println("\n------------------------------------------");
        System.out.println("             PASSWORD VERIFICATION          ");
        System.out.println("--------------------------------------------");
        System.out.println("User Name   : " + usrName);
        System.out.println("------------------------------------------");

        // --- Validation ---
        
        if (pwd.matches(storedPwd)) {

            System.out.println(" Valid Password! Your Password is correct, Welcome "+ usrName + " ! ");
           
        }else       {
        	System.out.println("Entered Password Wrong Try Again .");
        }       

        System.out.println("------------------------------------------");
        System.out.println("       Thank you for Banking with us!      ");
        System.out.println("------------------------------------------");

        sc.close();

	}

}
