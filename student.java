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
public class student {
    private void studentInfor(){
    String name="philemon";
    int age=15;
    int level=200;
    
    System.out.println("i am in the student class");
    System.out.println("My name is"+name+"i am "+age+"years old and in level"+level);
    
    }
    public double calcGPA()
    {
    double semesterGPA=3.5;
    int courseWeight=4;
    double GPA;
    
    GPA= semesterGPA * courseWeight;
    
    return GPA;
    
    //System.out.println("i am  inside student class");
    //System.out.println("my GPA is equal to "+GPA);
    
    }
    
    public static void main(String[]args)
    {
    student user1=new student();
    user1.studentInfor();
    
    double info;
    info=user1.calcGPA();
    System.out.println("My GPA is"+ info);
    }
    
}
