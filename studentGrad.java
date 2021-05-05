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
public class studentGrad {
    
    void graduateStud(double data){
    
    
    System.out.println("i am in student graduation class");
    System.out.println("My GPA is "+data);
    }
    public static void main(String [] args){
        Morninglec1 stud2 = new Morninglec1();
        stud2.calcGPA();
        
        
        studentGrad stud3 = new studentGrad();
        double some;
        some=stud2.calcGPA();
        some=stud2.calcGPA();
        stud3.graduateStud(some);
        
    }
    
}
