/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morninglec1;
import java.util.Scanner;
/**
 *
 * @author MARLIAN
 */
public class userPerson {
    
public void someCalc()
{
        int a, b;
        double c,d;
    Scanner input=new Scanner(System.in);
    System.out.print("please input the first number a:");
  a=input.nextInt();
     System.out.print("please input the first number b:");
  b=input.nextInt();
     System.out.print("please input the first number c:");
  c=input.nextInt();
  System.out.print("please input the first number d:");
  d=input.nextDouble();
    
    

int sum, difference;
sum=a+b;
difference=a-b;
double quotient, product;
quotient=c/d;
product=c*d;

System.out.print("class session: ");
System.out.println("sum of a and b is :" + sum +"and the difference is " + difference );
System.out.printf("The product of a and b is %.1f "
        + "and the %.2f is \n " ,product ,quotient);

}
  
public static void main(String [] args)
{
userPerson user1 = new userPerson();
user1.someCalc();
}
    
}
