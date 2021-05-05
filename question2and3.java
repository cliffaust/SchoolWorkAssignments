/*
ASANTE PHILEMON - 220010609
*/
package assignment2;

import java.util.Scanner; 
/*
2.Write an application that asks the user to enter two integers, 
obtains them from the user and prints their sum, product, difference and quotient.

3.Using the same class from Q2, create a method that allows the user to enter two integers, 
obtains them from the user and displays the larger number followed by the words “is larger”.
If the numbers are equal, print the message “its equal”.
*/

public class question2and3 {
    
	public static void main(String[] args) 
	{		
    /*
 * 2.Write an application that asks the user to enter two integers, 
     obtains them from the user and prints their sum, product, difference and quotient.
 */

        int num1 = 0;
        int num2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any two integers separated by a space: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.printf(
                "Sum: %d%n" +
                "Product: %d%n" +
                "Difference: %d%n" +
                "Quotient: %s%n",
                num1 + num2,
                num1 * num2,
                num1 - num2,
                 (num1 /num2) 
        );
   
     /*
    3.Using the same class from Q2, create a method that allows the user to enter two integers, 
      obtains them from the user and displays the larger number followed by the words “is larger”.
      If the numbers are equal, print the message “its equal”.
        */
        
        Scanner input = new Scanner(System.in);
		
			
		
		System.out.print("The first integer: ");	
		num1 = input.nextInt();	
		
		System.out.print("The second integer: ");	
		num2 = input.nextInt();	
		
		if (num1 > num2)
			System.out.printf("%d is larger than %d\n",num1,num2);
		
		if (num1 < num2)
			System.out.printf("%d is larger than %d\n", num2, num1);
		
		if (num1 == num2)
			System.out.println("its equal");
        
    }
        
}


            
            
            
            
            
            
            
            
		

		


    

