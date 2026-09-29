package com.java.fde.basiccontrol.staments.examples.seven;

import java.util.Scanner;

public class TaxSlab {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      TAX SLABS CHECK SYSTEM              ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // --- Input ---
        System.out.print("Enter your Salary per Anum   :- "); 
        while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter Salary Again:- ");
			sc.next();
		}
        double salary=sc.nextDouble();
                
        if (salary<=0) {
        	System.out.println("Zero or negative values are not allowed.");
		} else if(salary<=400000 ){
			System.out.printf("you do not need to pay any Tax" );
		}else if(salary<=800000 ){
			double tax =(salary*5)/100;
			System.out.printf("you  need to pay ₹%.2f%n" , tax );
		}else if(salary<=1200000 ){
			double tax =(salary*10)/100;
			System.out.printf("you need to pay ₹%.2f%n" , tax );
		}else if(salary<=1600000 ){
			double tax =(salary*15)/100;
			System.out.printf("you need to pay ₹%.2f%n" , tax );
		}else if(salary<=2000000 ){
			double tax =(salary*20)/100;
			System.out.printf("you need to pay ₹%.2f%n" , tax );
		}else if(salary<=2400000 ){
			double tax =(salary*25)/100;
			System.out.printf("you need to pay ₹%.2f%n" , tax );
		}else {
			double tax =(salary*30)/100;
			System.out.printf("you need to pay ₹%.2f%n" , tax );
		}
        
        sc.close();

	}

}
