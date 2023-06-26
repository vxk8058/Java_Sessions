package com.ram;

import java.util.LinkedList;

public class LinkedListProblems {
	
	class Node {
		public int data;
		public Node next;
		
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public int numNodes() { 
		 int count = 0;  
        Node current = head;    
        while(current != null) {   
            count++;    
            current = current.next;    
        }    
        return count;
	}
	
	public void show() {
		Node current = head;    
	    if(head == null) {    
	        System.out.println("List is empty");    
	        return;    
	    }    
	    System.out.println("Nodes of the linked list: ");    
	    while(current != null) {    
	        //Prints each node by incrementing pointer    
	        System.out.print(current.data + " ");    
	        current = current.next;    
	    }    
	    System.out.println();    
	}
	
	public static void main(String[] args) {
		/*
		 * LinkedList<String> food = new LinkedList<>(); food.addFirst("Ice Cream");
		 * food.addLast("Cheesecake"); System.out.println(food); food.removeFirst();
		 * System.out.println(food);
		 */
		LinkedListProblems list = new LinkedListProblems();
		list.addNode(1);
		list.addNode(10);
		list.addNode(50);
		list.show();
		System.out.println("The number of nodes in the list is " + list.numNodes());
		
	}
	
	
}
