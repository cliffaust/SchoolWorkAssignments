
package calculateretail;

import java.util.Scanner;

/**
 *
 * @author Philemon
 * 
 */

public class MarkupPercentage{

   static Scanner console = new Scanner(System.in);
   public static void main(String[]args ) {
       double item, total, markup;
       
       System.out.print("give out the item price: ");
       item = console.nextDouble();
       System.out.print("Mark Up Percentage : ");
       markup = console.nextDouble();
       
       total = item + (item * markup / 100.0);
       
       System.out.print("the final price the item is: " );
       System.out.println(total); 
       
   