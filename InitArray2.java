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
public class InitArray2 {
  
    public static void main(String[] args)
    {
    final int AARRAY_LENGTH = 10; //declear constant
    int[] array =  new int[AARRAY_LENGTH]; //creat array
    
    //calculate value for each array elemt
    for(int counter =0; counter < array.length; counter++ )
    array[counter]=2+2*counter;
    
     System.out.printf("%s%8s\n","index","value"); //column headings
     
     //output each array element's value
    for(int counter =0; counter < array.length; counter++ )
        System.out.printf("%5d%8d\n",counter,array[counter]);
    
    }
}
