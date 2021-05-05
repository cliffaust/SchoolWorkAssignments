/* QUESTION 3
 3.The Fibonacci series 0, 1, 1, 2, 3, 5, 8, 13, 21, … begins with the terms 0 and 1
and has the property that each succeeding term is the sum of the two preceding terms. Write a method fibonacci( n ) 
that calculates the nth Fibonacci number. Incorporate this method into an application that enables the user to enter the value of n. 
(Hint: You may use the concept of recursion)
 */
package Assignment3;

import java.util.Scanner;

/**
 TUDENT NAME: ASANTE PHILEMON
STUDENT ID: 220010609
 */
public class Fibonacci {
  
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter value of n: ");
		int n = input.nextInt();
		System.out.printf("Fibonacci(n) is: = %d%n", fibona(n));
		
		
	}
	
	public static int fibona(int n) {
		int fib0 = 0;
		int fib1 = 1;
		if (n == 1) {
			return fib0;
		}
		n -= 2;
		for(; n > 0; --n) {
			fib1 = fib1 + fib0;
			fib0 = fib1 - fib0;
		}
		return fib1;
	}
	
	
}
 