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
public class studentPeople {
    String name="MARLIAN"; //global varibles
    int age=1111;
    int level=200;
    //pass the variables to the method
    private void studentInfo(int age, int level){
    
    System.out.println("i am in Student class");
    System.out.println("i am "  + age +"years old and in level"+level); 
    }
    private void studentInfo(String name)
    {
        studentInfo(age,level);
        write();// calls the static method write inside another method
        String programe;// local verible
    System.out.println("i am a new method");
    System.out.println("my name is " +name);
    }
    
    static void write()
    {
    System.out.println("i am wirting my name");
    }
    public static void main(String[] args)
    {
        int a,b , d;
        String c;
        d=Integer.parseInt("50");
       
    System.out.println(d);
    studentPeople people2 = new studentPeople();
    Scanner scan = new Scanner(System.in);
    System.out.println("accept information for name:");
    c=scan.nextLine();
    System.out.println("accept information for age:");
    a=scan.nextInt();
    System.out.println("accept information for level:");
    b=scan.nextInt();
    
    
    people2.studentInfo(a, b);
    System.out.println("------inside this class----");
    studentPeople people3 = new studentPeople();
    people3.studentInfo(a, b);
    
    System.out.println("------second method-------");
    people3.studentInfo(c);
    }
}
