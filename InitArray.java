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
public class InitArray {
    
    public static void main(String[] args)
    {
    //initializer list specifies the value each element
    int[] array = {32,27,64,18,95,14,70,60,37};
    System.out.printf("%s%8s\n","index","value"); //column headings
    
    //output each array element's value
    for(int counter =0; counter < array.length; counter++ )
        System.out.printf("%5d%8d\n",counter,array[counter]);
    }
}


