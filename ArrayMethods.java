/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/**
 *
 * @author MARLIAN
 */
public class ArrayMethods {
    public static void main(String[] args)
    {
    String[] names={"asante","philemon","Ibrahim","Kwabena"};
    int[] numbers={34,65,76,67,98,23};
    
    for (String s: names)
        System.out.print(  "\t"+s);
    System.out.println();
    
    for (int s:numbers)
        System.out.print(  "\t"+s);
    System.out.println();
    
    int[] number1={1,2,3,4,5,6,7,8};
    System.arraycopy(numbers,0,number1,0,4);
    System.out.println("\n element after first copy");
    for(int s: number1)
        System.out.print(  "\t"+s);
    System.out.println();
    
  
    System.arraycopy(numbers,0,number1,2,3);
    System.out.println("\n element after second copy");
    for(int s: number1)
        System.out.print(  "\t"+s);
    System.out.println();
    
    
     String[] namescopy={"asante","philemon","Ibrahim","Kwabena"};
     System.arraycopy(names,0, namescopy,1,3);
     
      for (String s: names)
        System.out.print(  "\t"+s);
    System.out.println();
    
    System.out.println();
    boolean ret=Arrays.equals(names, namescopy);
    System.out.print(ret);
    System.out.println();
    
    Arrays.sort(names);
     for(int s: number1)
        System.out.print(  "\t"+s);
    System.out.println();
    }
}
