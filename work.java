
package trialExams;
import java.util.Scanner; 

public class work {
   public static void main(String[] args) {
   
       
      Scanner scanner = new Scanner(System.in);
        System.out.print("First value: ");
        int valueOne = scanner.nextInt();
        System.out.println("Value entered is: " + valueOne);

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Second value: ");
        int valueTwo = scanner1.nextInt();
        System.out.println("Value entered is: " + valueTwo);

        int sum = valueOne + valueTwo;
        System.out.print("The sum of " + valueOne + " and " + valueTwo + " is: ");
        System.out.println(sum);

        int product = valueOne * valueTwo;
        System.out.print("The product of " + valueOne + " and " + valueTwo + " is: ");
        System.out.println(product);

        int difference = valueOne - valueTwo;
        System.out.print("The difference of " + valueOne + " and " + valueTwo + " is: ");
        System.out.println(difference);

        float d = valueOne;

        float quotient = d / valueTwo;
        System.out.print("The quotient of "+ valueOne+ " and "+valueTwo+" is: ");
        System.out.println(quotient);
        
   } 
}
