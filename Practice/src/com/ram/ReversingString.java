package com.ram;

public class ReversingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Hello World!";
		String reverseName = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			//reverseName = reverseName.concat(String.valueOf(name.charAt(i)));
			reverseName += name.charAt(i); 
		}
		System.out.println(reverseName);
	}

}
