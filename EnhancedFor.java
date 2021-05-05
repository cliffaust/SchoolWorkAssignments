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
public class EnhancedFor {
    
    public static void manin(String[] args)
    {
    int[] arrays= {87,33,14,25,63,5,16,98,78};
    int total=0;
    
    for(int number:arrays)
        total+=number;
    
    
    System.out.printf("the sum of the numbers is %d \n",total);
    }

}
