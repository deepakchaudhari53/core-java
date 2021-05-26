package com.mindscripts;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		System.out.println("Enter your username: ");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();

		System.out.println("Your username is " + username);
		System.out.println("Enter your qualification: ");
		String qualification = scanner.nextLine();
		System.out.println("Your qualification is " + qualification);

		boolean b = false;
		while (!b) {
			System.out.println("Enter your operation: addition, subtraction, multiplication, division ");
			String operation = scanner.next();
			System.out.println(operation);
			System.out.println("Enter two numbers ");
			int i = scanner.nextInt();
			int j= scanner.nextInt();

			if (operation.equals("addition")) {
				
				System.out.println("addition is: "+(i+j));
				System.out.println("addition operation done");
				b=true;
			}

			else if (operation.equals("subtraction")) {
				System.out.println("subtraction is: "+(i-j));
				System.out.println("subtraction operation done");
				b = true;
			}

			else if (operation.equals("multiplication")) {
				System.out.println("multiplication is: "+(i*j));
				System.out.println("multiplication operation done");
				b = true;
			} else if (operation.equals("division")) {
				System.out.println("division is: "+(i/j));
				System.out.println("division operation done");
				b = true;
			}

			else {
				System.out.println("Wrong operation!");
			}
		}

	}

}
