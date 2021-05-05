/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondlec;

/**
 *
 * @author FELICIA
 */
public class tryExample {
    int num, sum;//global variables
    
    private void find()
    {
    int average=0;//local variable
    //if(z=(x>y)?10:5)
    int z,y=6,x=8;
    System.out.println("My values are "+ (z=(x<y)?10:5));
  
    //The statement in line 20 is the same as represented in the commented lines 23-30
    //try with different values of x and y
    
    /*if(x<y){
        z=10;
    System.out.println("My values are " + z);
    }
    else{
    z=5;
    System.out.println("My values are " + z);
            }*/
    }
    public static void main(String[] args){
    tryExample t =new tryExample();
    t.find();
    
    }
}
