/* QUESTION 2
 2.Write an application to simulate the rolling of two dice.
The application should use an object of class Random once to roll the first die
and again to roll the second die. The sum of the two values should then be calculated. 
Each die can show an integer value from 1 to 6, so the sum of the values will vary 
from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the least frequent. 
 */
package Assignment3;

/**
 TUDENT NAME: ASANTE PHILEMON
STUDENT ID: 220010609
 * 
 */

public class RollDice{

  public static void main(String[] args) {
        int SIDES = 6;   

        
        int roll1 = (int) (Math.random() * SIDES) + 1;
        int roll2 = (int) (Math.random() * SIDES) + 1;
       
        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println("the total is :"+ (roll1+ roll2));
  
  }
}



