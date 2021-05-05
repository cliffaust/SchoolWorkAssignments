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
public class arithmetic {
   private static void calc(){
   for(int i=0; i<5;i++){
   switch(i){
       case 0:
           System.out.println("the value of i is 0");
           break;
       case 1:
           System.out.println("the value of i is 1");
           break;
       case 2:
           System.out.println("the value of i is 2");
           break;
       default:
           System.out.println("the value of i is greater than 2 and less than 5");
               }
   }
   }
   
   static void phones()
   {
       Scanner scan=new Scanner(System.in);
   //String mobile = "iPhone";
   for(;;){
   System.out.println("Kindly enter your type of phone");
   String mobile;
   mobile=scan.nextLine();
        switch (mobile) {
        case "samsung":
            System.out.println("Buy a Samsung phone");
            break;
             
        case "iPhone":
            System.out.println("Buy an iPhone");
            break;
             
        case "Motorola":
            System.out.println("Buy a Motorola phone");
            break;
        default:
            System.out.println("We do not have your type of phone");
        }
   }

   }
    public static void main(String[] args)
    {
    calc();
    phones();
    }
}

