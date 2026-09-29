package com.java.fde.basiccontrol.staments.examples.seventeen;

import java.util.Scanner;

public class PolicyTypeSelection {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      POLICY TYPE TRACKER SYSTEM          ║");
        System.out.println("╚══════════════════════════════════════════╝");

        System.out.println("\n========= SELECT CATEGORY =========");
        System.out.println(" 1. Health");
        System.out.println(" 2. Life");
        System.out.println(" 3. Vehicle ");
        System.out.println("====================================");
        System.out.print("Enter Your Choice :- ");
        
        while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter Order Status Again:- ");
			sc.next();
		}
        int choice=sc.nextInt();
                
        switch (choice) {
		case 1:
			System.out.println("Policy type : Health");
            System.out.println("You Selected Health-Care Policy Successfully");
			break;
			
		case 2:
			System.out.println("Policy type : Life");
            System.out.println("You Selected Life-Insurance Policy Successfully");
			break;
			
		case 3:
			System.out.println("Policy type : Vehicle");
            System.out.println("You Selected Vehicle Policy Successfully");
			break;	
		
		default:
			System.out.println(" Invalid Status Code: " + choice);
            System.out.println("   Please enter 1, 2, or 3.");
			
		}
                
        System.out.println("------------------------------------------");
        System.out.println("     Thank you for shopping with us!      ");
        System.out.println("------------------------------------------");
        
		sc.close();

	}
        	

}
