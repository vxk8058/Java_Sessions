package com.ram;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	    System.out.print("Enter a number: ");
	    int num = input.nextInt();
	    int temp = 0;
	    while (num != 0) {
	      int mod = num % 10;
	      temp = temp * 10 + mod;
	      num = num / 10;
	    }
	    System.out.println(temp);
	}

}