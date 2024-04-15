package com.tasks;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Welcome to Ziz Password Services :)\n");
		while(true) {
			System.out.println("Enter 1 - Password Generator");
			System.out.println("Enter 2 - Password Strength Check");
			System.out.println("Enter 3 - Useful Information");
			System.out.println("Enter 4 - Quit");
			System.out.print("Choice: ");
			int input = sc.nextInt();
			switch(input) {
				case 1 :
					PasswordGenerator passwordGenerator = new PasswordGenerator(sc);
					passwordGenerator.generator();
					break;
				case 2 :

					PasswordStrengthChecker passwordStrengthChecker = new PasswordStrengthChecker(sc);
					passwordStrengthChecker.tester();
					break;
				case 3 :
					PasswordStrengthChecker.information();
					break;
				case 4:
					sc.close();
					return;

			}
		}
	}

}
