package com.java.fde.basiccontrol.staments.examples.twentyfive;

import java.util.Scanner;

public class NoBillPay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean continueApp=true;
		
		System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║          BILL PAYMENT SYSTEM             ║");
        System.out.println("╚══════════════════════════════════════════╝");
		
        while (continueApp) {
            System.out.println("\n========= BILL PAYMENT OPTIONS =========");
            System.out.println(" 1. Electricity Bill");
            System.out.println(" 2. Water Bill");
            System.out.println(" 3. Mobile Recharge");
            System.out.println(" 4. DTH Recharge");
            System.out.println(" 5. Broadband Bill");
            System.out.println(" 6. Exit");
            System.out.println("==========================================");
            System.out.print("Enter Your Choice :- ");
            
            while (!sc.hasNextInt()) {
                System.out.print("❌ Invalid Number. Enter Choice Again :- ");
                sc.next();
            }
            int choice = sc.nextInt();
            sc.nextLine();
            
            if (choice == 6) {
                System.out.println("\n Thank you for using Bill Payment System. Goodbye!");
                break;
            }
            
            String billType;
            
            switch (choice) {
            case 1:
                billType = "Electricity Bill";
                break;
            case 2:
                billType = "Water Bill";
                break;
            case 3:
                billType = "Mobile Recharge";
                break;
            case 4:
                billType = "DTH Recharge";
                break;
            case 5:
                billType = "Broadband Bill";
                break;
            default:
                billType = null;
        }

        if (billType == null) {

            System.out.println("❌ Invalid choice. Please select 1 to 6.");
        }else {
			
		}
        
        System.out.print("Enter Consumer No. for Bill Payment(s) :- ");
        String noBillPayment = sc.nextLine().trim();
        
        System.out.print("Enter Amount to Pay (₹)       :- ");
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid Number. Enter Amount Again :- ");
            sc.next();
        }
        double amount = sc.nextDouble();
        sc.nextLine();
        if (amount<=0)
        	{
			System.out.println("Invalid Amount: Payment amount must be greater than zero.");
		}else {
			System.out.println("\n------------------------------------------");
            System.out.println("           PAYMENT CONFIRMATION            ");
            System.out.println("------------------------------------------");
            System.out.println("Bill Type          : " + billType);
            System.out.println("Consumer Number    : " + noBillPayment);
            System.out.printf ("Amount Paid        : ₹%.2f%n", amount);
            System.out.println("Status             : Payment Successful");
            System.out.println("------------------------------------------");
		}
        System.out.print("\n Do you want to make another payment? (yes/no) :- ");
        String again = sc.nextLine().trim();
        if (!again.equalsIgnoreCase("yes")) {
            continueApp = false;
            System.out.println("\n Thank you for using Bill Payment System. Goodbye!");
     		}
		}
        sc.close();
	}
}
