/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morninglec1;

/**
 *
 * @author TEENGRIDE
 */
public class Morninglec1 {

    private void studentInfo(){
    String name="asante";
    int age=12;
    int level=22;
    
    
    System.out.println("i am in Student class!!!");
    System.out.println("My name is "+ name+ ", i am "
    + age +"years old and in level "+ level);
    
   
    }
    
    public double calcGPA(){
    double semesterGPA=3.5;
    int courseWeight=3;
    double GPA;
    
    GPA= semesterGPA * courseWeight;
    
    return GPA;
    
    //System.out.println("i am inside student class");
   // System.out.println("My GPA is equal to"+ GPA);
    }
    public static void main(String[] args) {
        
        Morninglec1 stud1 = new Morninglec1();
        stud1.studentInfo();
        
        double info;
        
        info=stud1.calcGPA();
        System.out.println("my GPA is "+ info);
        
        
       
        
    }
    
}
