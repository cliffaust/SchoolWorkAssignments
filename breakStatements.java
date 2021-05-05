/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trialExams;

import java.io.IOException;
import java.util.Random;

public class breakStatements {
    static void ludu(){
    
    
    Random rand=new Random();
    int num=0; double some;
   try{
  for(int i=0;i<=10;i++)
    {
    num=rand.nextInt(6);
    System.out.println("number:"+num);
    System.out.println("=============double");
    some=rand.nextDouble();
    System.out.println("number:"+ some);
    }
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("number"+ num);
    }
    
    void numbers(){
        try{
            for(int i=0;i<10;i++)
            {
            if(i==5)
                continue;
            else
                System.out.println("number :"+i);
            }
        }
        
catch(Exception e)
{
    System.out.println(e);
}
    }
   
   public static void main(String[] args)
   {
   breakStatements num=new breakStatements();
   num.numbers();
   
   System.out.println("---ludo-------");
   ludu();
   }
}
    
    
