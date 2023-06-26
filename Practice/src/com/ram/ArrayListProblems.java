package com.ram;

import java.util.ArrayList;

public class ArrayListProblems {
	
	public static void main(String[] args) {
		System.out.println("hello world!");
		ArrayList<Integer> list =new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(sameFirstLast(list));
		System.out.println(list);
		list.add(2, 1);
		list.remove(3);
		System.out.println(sameFirstLast(list));
		System.out.println(list);
	}
	
	/*
     * Given a list of integers, return true if the list is size 1 or more, and the
     * first element and the last element are equal.
     * 
     * sameFirstLast([1, 2, 3]) → false
     * sameFirstLast([1, 2, 3, 1]) → true
     * sameFirstLast([1, 2, 1]) → true
     */
    public static boolean sameFirstLast(ArrayList<Integer> list) {
    	if (list.size() >= 1 && list.get(0).equals(list.get(list.size() - 1))) {
    		return true;
    	} else {
    		return false;
    	}
    }

}
