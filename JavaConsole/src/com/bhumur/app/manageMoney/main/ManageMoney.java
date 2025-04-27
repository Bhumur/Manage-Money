package com.bhumur.app.manageMoney.main;

import java.util.Scanner;

public class ManageMoney {

	public static void main(String[] args) {
		System.out.println("Jai Shree Ram");
		
		try(Scanner sc = new Scanner(System.in)){
			int option;
			do {
				
				System.out.println("-------MENU------");
				System.out.println("1. Add User.");
				System.out.println("2. Make Group.");
				System.out.println("3. Add User to Group.");
				System.out.println("4. Remove User From Group.");
				System.out.println("5. Add Transaction individually.");
				System.out.println("6. Add Transaction in Group.");
				System.out.println("7. Display Group Transaction.");
				System.out.println("8. Display Individual Transactions.");
				System.out.println("9. Show All Balance Summary.");
				System.out.println("0. Save and Exit.");
				System.out.print("\n\nEnter Chioce : ");
				
				option = sc.nextInt();
				switch(option) {
					case 1: {
						System.out.println("1. Add User.");
						
						break;
					}
				}
			}while(option!=0);
		}
	}

}
