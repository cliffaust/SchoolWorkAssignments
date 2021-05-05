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
public class tryCatch {
    
    public static void main(String[ ] args)
    {
    int[] responses ={1,3,5,7,3,5,6,2,1,5,3,2,5,7,3,5,6,7,3};
    int[] freq = new int[6];
    
    for(int answer=0; answer < responses.length; answer++ )
    {
    try{
    ++freq[responses[answer]];
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
    System.out.println(e);
    System.out.printf("responses[%d]=%d\n\n", answer,responses[answer]);
    }
    }
    System.out.printf("%s%10s\n","Rating","Frequency");
    for(int rating=1;rating<freq.length;rating++)
    {
    System.out.printf("%6d%10s\n",rating, freq[rating]);
    }

    }
}
