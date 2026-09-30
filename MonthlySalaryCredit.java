package com.java.fde.basiccontrol.staments.examples.twentytwo;

import java.util.Scanner;

public class MonthlySalaryCredit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] Months= {"January","February","March","April","May","June","July",
				"August","September","October","November","December"};
		
		int missCount=0;
		String[]missMonth=new String[12];
		

		System.out.println("╔══════════════════════════════════════════╗");
		System.out.println("║      MONTHLY SALARY CREDIT SYSTEM        ║");
		System.out.println("╚══════════════════════════════════════════╝");
		
		System.out.println("\nFor each month, enter 'yes' if salary was credited, 'no' if not.\n");

		for (int i = 0; i < 12; i++) {
			System.out.print("was salary credited in "+Months[i]+ " ? (yes/no) :- ");
			String res=sc.nextLine().trim();
			
			while (!res.equalsIgnoreCase("yes")&& !res.equalsIgnoreCase("no")) {
				System.out.println(" Invalid Input just enter 'yes' or 'no' ");
				res=sc.nextLine().trim();
			}
			if (res.equalsIgnoreCase("no")) {
				missMonth[missCount]=Months[i];
				missCount++;
			}
		}
		
        System.out.println("\n------------------------------------------");
        System.out.println("           SALARY CREDIT SUMMARY            ");
        System.out.println("------------------------------------------");
        
        if (missCount==0) {
			System.out.println("CONFIRMED: Salary was credited for all 12 months!");
		}else {
			System.out.println("WARNING: Salary was NOT credited in " + missCount + " month(s):");
			for (int i = 0; i < missCount; i++) {
				System.out.println(" - " + missMonth[i]);
			}
		}
        System.out.println("------------------------------------------");
        System.out.println("     Thank you for Banking with us!       ");
        System.out.println("------------------------------------------");


			sc.close();
		}
	}

