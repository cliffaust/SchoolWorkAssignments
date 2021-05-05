/*  QUESTION 1
 1.Write a method that takes an integer value and returns the number with its digits reversed.
For example, given the number 7631, the method should return 1367. Incorporate the method into an 
application that reads a value from the user and displays the result.  
 */
package Assignment3;

/** STUDENT NAME: ASANTE PHILEMON
 *  STUDENT ID: 220010609
 * 
 */
import java.util.Scanner;

public class ReverseNumber {

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Give the number to be reversed : ");
       int enter = input.nextInt();
       int total = reverse(enter);
       System.out.println("Your reversed number is " + total);
   }

   public static int reverse(int a) {
       int total = 0;
       int rev;
       while (a > 0) {
           rev = a % 10;
           a = a / 10;
           total = total * 10 + rev;
       }
       return total;
   }
}
