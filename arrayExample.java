/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayexmples;

/**
 *
 * @author MARLIAN
 */
public class arrayExample {
    static void Details()
    {
    String[] names={"asante","ama","kofi","taa"};
    for(String n:names)
       System.out.println(n);
    
    
 System.out.println("the size of thr arrray"+ names.length);
    }
    public static void main(String[] args)
{
    arrayExample some= new arrayExample();
Details();
}
    static void numbers()
    {
     int[]num = new int [5];
     num[0]=56;
     num[1]=25;
     num[2]=45;
     num[3]=12;
     num[4]=89;
     
    
     System.out.println(num[1]);
    }
    }

