package com.ram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestApp{
	
	public static void main(String[] args) {
	    boolean isSuccessful = false;
	    try {
	        Integer x = null;
	        Integer y = null;
	        try {
	            String a = args[0];
	            String b = args[1];
	            x = Integer.parseInt(a);
	            y = Integer.parseInt(b);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("The input supplies not sufficient, Please verify ::: " + e.getMessage());
	            isSuccessful = false;
	        }

	        try {
	            String a = args[0];
	            String b = args[1];
	            x = Integer.parseInt(a);
	            y = Integer.parseInt(b);
	        } catch (NumberFormatException e) {
	            System.out.println("The input supplies not a number, Please verify ::: " + e.getMessage());
	            isSuccessful = false;
	        }

	        try {
	            System.out.println(x / y);
	            isSuccessful = true;
	        } catch (ArithmeticException e) {
	            System.out.println("The arithmetic operation is failing, Please verify ::: " + e.getMessage());
	            isSuccessful = false;
	        }

	        try {
	            System.out.println(x / y);
	            isSuccessful = true;
	        } catch (NullPointerException e) {
	            System.out.println("The arithmetic operation is failing, Please verify ::: " + e.getMessage());
	            isSuccessful = false;
	        }

	        try {
	            System.out.println(x / y);
	            isSuccessful = true;
	        } catch (RuntimeException e) {
	            System.out.println("The arithmetic operation is failing, Please verify ::: " + e.getMessage());
	            isSuccessful = false;
	        }

	    } catch (ArithmeticException e) {
	        System.out.println("The arithmetic operation is failing for, Please verify ::: " + e.getMessage());
	        isSuccessful = false;
	    } catch (NullPointerException e) {
	        System.out.println("The arithmetic operation is failing for, Please verify ::: " + e.getMessage());
	        isSuccessful = false;
	    } catch (RuntimeException e) {
	        System.out.println("The arithmetic operation is failing for, Please verify ::: " + e.getMessage());
	        isSuccessful = false;
	    } finally {
	        if (isSuccessful) {
	            System.out.println("All good :)");
	        } else {
	            System.out.println("Not good :(");
	        }
	    }
	}
}
