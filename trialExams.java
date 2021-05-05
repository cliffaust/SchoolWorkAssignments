/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trialExams;

/**
 *
 * @author TEENGRIDE
 */
public class trialExams {
    
    
    static void numbers()
    {
       int num=20;
       while(num>1)
       {
       System.out.println(num);
       num=num/2;
       }
    
    
    }
    static void doWhile()
    {
    int num=20;
    do{
    System.out.print(num);
    num=num/2;
    }while(num>1);
    }
    
    
    static void forloop()
    {
    for(int i=1; i<=20; i++)
    {
    if(i%2==1)
        System.out.println("even" + i);
    else
        System.out.println("odd:" + i);
    }  
    }
    
    public static void names()
    {
    String names = "MARLIAN";
    for(int i=10; i<10;i++)
    {
    System.out.println(names);
    }
    }
    
    public static void main(String [] args){
    int a=5, b=9;
    
    System.out.println(a++);//what will be the output?
    System.out.println(a);
    System.out.println(++a);
    
    
    System.out.println("-----------BBB--------");
    System.out.println(++b);//what will be the output?
    System.out.println(b);
    System.out.println(b++);
    System.out.println("-------------while-------");
    
    numbers();
    
    System.out.println("---------Do while-------");
    doWhile();
    
    System.out.println("---------Do while-------");
    forloop();
    
    System.out.println("---------names loop-------");
    names();
    }
   
{
String name="marlain";
for(int i=0; i<10;i++)
{
System.out.println(name);
}

for(int i=1;i<49;i++)
{
if(i%2==1)
    System.out.println("odd: number: " +i);
}
int count=0;
System.out.println("---------fifth number-------");
for(int i=0;i<100; i++)
{
count ++;
if(count%5==0)
System.out.println("Fifth number:"+i);
}
   
}

}
