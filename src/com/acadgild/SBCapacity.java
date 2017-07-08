package com.acadgild;

import java.util.Scanner;
/*
 * Write a program in java to show how the capacity is changing in StringBuffer or in
 * StringBuilder if we append the string.
 * 
 * Hint: - The capacity changes according to the formula = Initial_capacity*2+2.
 * 
 * In this program, user will keep entering words and phrases to be appended onto the
 * StringBuffer. They will see capacity every time they do this.
 */
public class SBCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("");
		
		System.out.println("I will append your words and phrases into my"
				+ "\nStringBuffer, and tell you it's current capacity.");
		
		do{
			System.out.println("Enter your word or phrase:");
			
			//Appended every String user enters to StringBuffer
			sb.append(user.nextLine());
			
			//Show user the current capacity of the StringBuffer
			System.out.println("The current capacity is: " + sb.capacity());
			
			//Tell user how many characters will cause a capacity increase
			System.out.println("You need " + (sb.capacity()-sb.length()) + " more characters to max "
					+ "out.\nDo you want to continue? Enter y or n.");
		}
		//Repeat according to user's will
		while(user.nextLine().equalsIgnoreCase("y"));
		
		//Valediction
		System.out.println("Thanks for playing.");
		user.close();
	}

}
