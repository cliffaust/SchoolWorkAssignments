/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morninglec1;

/**
 *
 * @author MARLIAN
 */
public class userDetails {
    public static void myDetails()
    {
    String name="Philemon";
    int age=12;
    int level=200;
    
    System.out.println("my name is"+ name );
    System.out.println("my age is"+ age);
    System.out.println("i am in level"+level);
    
    System.out.println("my name is"+ name +"and my age is"+age+"am in level 200"+level);
    
    }
    public static void main(String [] args)
    {
    System.out.println("this is my first output statement in java");
    System.out.print("hello world");
    System.out.print("\n what is your name \n ");
    
    myDetails();
    }
    
}
