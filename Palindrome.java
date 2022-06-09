/* File Name: Operations.java 
Purpose: Finds whether a string you entered is a palindrome 
Author: Angelique Benitez
Date Last Modified: 09/15/2019
*/
import java.util.Stack;
import java.util.Scanner;

class Palindrome {
	public static void main(String[] args) {

	String palindromeString; 
			Scanner sc = new Scanner(System.in);
	 		System.out.println("Enter a string:"); 
	 		palindromeString = sc.nextLine();  
			System.out.println("You entered the string: "+palindromeString);
			
			Stack stack = new Stack(); 
			for (int i = 0; i < palindromeString.length(); i++){
				stack.push(palindromeString.charAt(i));
			}
			String backwardsString = ""; 
			while (!stack.isEmpty()) {
				backwardsString = backwardsString+stack.pop(); 
			}
			if (palindromeString.equals(backwardsString)){
				System.out.println("This string is a palindrome!");
			}
			else {
				System.out.println("This string is NOT a palindrome!");
			}
	}
	
	
}
