package com.ram;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int recursion = factorial(10);
		System.out.println(recursion);
		int fib = fibonacci(5);
		System.out.println(fib);
	}
	
	public static int factorial (int m) {
		if (m > 1) {
			return m * factorial(m - 1);
		} else {
			return 1;
		}
	}
	
	public static int fibonacci (int i) {
		if (i >= 2) {
			return fibonacci(i - 1) + fibonacci(i - 2);
		} else {
			return i;
		}
	}

}
