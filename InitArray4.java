/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philemonwork;

/**
 *
 * @author MARLIAN
 */
public class InitArray4 {
    
    public static void main(String[] args)
    {
    int[][] array1 = {{1,2,3},{4,5,6}};
    int[][] array2 = {{1,2},{3},{4,5,6}};
    
    System.out.println("values in array1 by raw are");
    outputArray(array1);
    
    System.out.println("values in array2 by raw are");
    outputArray(array2);
    }
    public static void outputArray(int[][] array)
    {
        for (int row =0; row < array.length; row++)
        {
            for (int column=0; column < array[ row].length; column++)
            System.out.printf("%d ", array[row][column]);
            System.out.println();
        } 
    }
}

