/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputsates;

import java.util.Scanner;

/**
 *
 * @author MARLIAN
 */
public class trial {
    private void details( String name,int age, int level)
    { 
  
    System.out.println("My details are  "+name +" "+age+" "+level);
    }
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the following details :");
    System.out.println("name");
  String  name=input.nextLine();
    System.out.println("Age:");
   int age=input.nextInt();
    System.out.println("level:");
   int level=input.nextInt();
        
    trial try1 = new trial();
    try1.details(name,age,level);
    trial try2 = new trial();
    try2.details("marlian", 20, 600);
    }
}
