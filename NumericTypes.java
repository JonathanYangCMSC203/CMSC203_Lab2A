/*
 * Author: Jonathan Yang
 * Lab 2a
 */

import java.util.Scanner;

/**
 * Author: Jonathan Yang
   This program demonstrates how numeric types and operators behave in Java
*/
public class NumericTypes {
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here 
		//identifier declarations
		final int NUMBER = 2; // number of scores
		int score1 = 100; // first test score
		int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		Scanner in = new Scanner(System.in);//Task #2 declare a variable to hold the user’s temperature		
		System.out.print("Enter first test score: ");//Task #2 prompt user to input score1
		score1 = in.nextInt();//Task #2 read score1 
		System.out.print("Enter second test score: ");//Task #2 prompt user to input score2
		score2 = in.nextInt();//Task #2 read score2 
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5.0/9.0) * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		System.out.print("Enter a temperature in fahrenheit: ");//Task #2 prompt user to input another temperature
		int fahrenheit = in.nextInt();//Task #2 read the user’s temperature in Fahrenheit
		fToC = (5.0/9.0) * (fahrenheit - 32);//Task #2 convert the user’s temperature to Celsius
		System.out.println(fahrenheit + " in Fahrenheit is " + fToC + " in Celsius.");//Task #2 print the user’s temperature in Celsius
		System.out.println("Goodbye"); // to show that the program is ended	
		in.close();
	}
}

