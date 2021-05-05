/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author MARLIAN
 */
public class IntArray5 {
     public static void main(String[] args)
     {
     if (args.length !=3)
         System.out.println("Error: please re-enter the entire command, including\n"+
                 "an array size, intial value and increment.");
     else
     {
     int arrayLength = Integer.parseInt(args[0]);
     int[]array = new int[arrayLength];
     
     int initialvalue = Integer.parseInt(args[1]);
     int increment = Integer.parseInt(args[2]);
     
    for(int counter =0; counter < array.length; counter++ )
        array[counter]=initialvalue + increment * counter;
    
       System.out.printf("%s%8s\n", "index", "value");
        
       for(int counter =0; counter < array.length; counter++ )
           System.out.printf("%5d%8d\n",counter, array[counter]);
     }
     }
}
