/*
ASANTE PHILEMON - 220010609
*/
package assignment2;
/*assignment2
 * Write an application that displays the numbers 1 -4 on the same line, with each pair of adjacent numbers separated by a space Use the following techniques
 * (a) Use one System.out.println statement
 * (b) Use four System.out.print statements
 * (c) Use one System.out.printf statement
 */

public class Assignment2 {

    
    public static void main(String[] args) {
        
        
		int num1 = 1;	
		int num2 = 2;	
		int num3 = 3;	
		int num4 = 4;	
		
		// (a) Use one System.out.println statement
		System.out.println("Part (a)");
		System.out.println(num1+" "+num2+" "+num3+" "+num4);
		
		System.out.println();
		
		// (b) Use four System.out.print statements
		System.out.println("Part (b)");
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		System.out.print(num3+" ");
		System.out.print(num4);
		
		System.out.println("\n");
		
		// (c) Use one System.out.printf statement
		System.out.println("Part (c)");
		System.out.printf("%d %d %d %d", num1,num2,num3,num4);
		
	}	
	
}	    
    

