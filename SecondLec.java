/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondlec;

import java.util.Scanner;
/**
 *
 * @author FELICIA
 */
public class SecondLec {
    /**
     * @param args the command line arguments
     */
    //global variables
    int num;
    double sum; 
    public void calc(int num)
    {
        sum=0;
    for(int a=0; a<=num;a++)
    {
    sum=sum+a;
    }
    System.out.printf("The value of the sum of numbers between "
            + "1 and %d is %.3f \n ", num, sum);
    System.out.println("-----------------------");
    }
    
    private double findNum(int num)
    {
        sum=0;
        double average=0;
        if(num<5)
            System.out.println("Number is too small for an average");
        else
        {
        for(int a=0; a<=num;a++)
        {
            sum=sum+a;
           }
        average=sum/num;
        System.out.printf("The average of number %d  is %.2f ", num, average);
        }
    return average;
    }
    private static void doFind()
    {
    int value=2,sum=0;
    while(value<=25)
    {
        sum+=value;
    value++;
    if(value==100)
        break;
    }
    System.out.println("The value of sum is  "+sum);
    }
    public void calc()
    {
    System.out.println("i am a lone method:") ;
    }
    public void calc(String name, int age)
    {
     System.out.println("My destails"+name +""+age);    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int value;
        Scanner input=new Scanner(System.in);//input from the keyboard
        System.out.println("Kindly enter the number to be tested");
        value=input.nextInt();
        
        double output;
        //create an object of SecondLec
        SecondLec sec=new SecondLec();//object declaration
        sec.calc(value);
        output=sec.findNum(value);
        SecondLec sec2=new SecondLec();
        sec2.findNum(value);
        System.out.println("The average value is "+output);
        System.out.println("\n ----------------");
        doFind();//this is a static method
        sec2.calc("asante", 1222);
           
    }
    static void numbers()
    {
    int number;
    Scanner scan = new Scanner(System.in);
    System.out.print("Kindly enter a number between 1-9");
    number = scan.nextInt();
    int num, a=6,b=5;

    }
}
