package com.ram;

import java.util.Scanner;

public class ConditionalLoops {

	public static int bdDate;
	public static int bdMonth;
	public static int bdYear;
	public static int cYear;
	
	public static void main(String[] args) {
		// Can Vote- conditionals
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your birth date: ");
        bdDate = input.nextInt();
        System.out.print("Enter your birth month: ");
        bdMonth = input.nextInt();
		System.out.print("Enter your birth year: ");
        bdYear = input.nextInt();
		cYear = 2023;
        
		if (cYear - bdYear >= 18) {
			System.out.print("You can Vote!");
		} else {
			System.out.print("You cannot vote!");
		}
		
		// Repeats- for loop
		for (int i =  0; i < cYear - bdYear + 1; i++){
            System.out.println("I am " + i + " year[s] old this year!");
        }
		
		/*// Count down- while loop
		int days = 365;
		System.out.println("Countdown to New Year!!!");
		while (days >= 0) {
			System.out.println(days);
			days--;			
		}*/
		
	/*	// Age Validation- do while loop
		int age;
        do {
            System.out.print("Enter your age: ");
            while (!input.hasNextInt()) {
                System.out.print("Invalid input. Enter your age as a whole number: ");
                input.next();
            }
            age = input.nextInt();

            if (age < 0) {
                System.out.println("Invalid age. Please enter a positive number.");
            }
        } while (age < 0);

        System.out.println("Your age is: " + age);
        */
	}
}

