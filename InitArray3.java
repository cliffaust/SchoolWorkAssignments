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
public class InitArray3 {
    public static void main(String[] args)
    {
    int[] array={87,33,14,25,63,5,16,98,78};
    int total=0;
    
    for(int counter =0; counter < array.length; counter++ )
        total+=array[counter];
    
    System.out.printf("the sum of the numbers is %d \n",total);
    }
}
