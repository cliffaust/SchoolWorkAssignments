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
public class PassArray {
    public static void main(String[] args)
    {
    int[] array = {1,2,3,4,5};
    
    System.out.println("Effects of passing reference to entire  aray:\n" + "the values of the origiinal array are:");
    
    for(int value:array)
        System.out.printf(" %d",value);
    
    modifyArray(array);
    System.out.println("\n\nthe values of the modified are:");
    
    for(int value : array)
        System.out.printf(" %d",value);
    
    System.out.printf("\n\nEffects of passing array element value:\n" +"array[3]after modifyElement: %d\n",array[3]);
    
    modifyElement(array[3]);  
    }
    public static void modifyArray(int[] array)
    {
    for(int counter =0; counter<array.length; counter++)
        array[counter]*=2;
    }
     public static void modifyElement(int element)
    {
    System.out.printf("value of element in modifyElement: %d\n ",element);
    }
}
