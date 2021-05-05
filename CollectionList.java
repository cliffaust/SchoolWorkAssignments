/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.*;
/**
 *
 * @author MARLIAN
 */
public class CollectionList {
    public static void main(String[] args)
    {
    ArrayList<String> list = new ArrayList<String>();
    list.add("asante");
    list.add("Marlian");
    list.add("Ibrahim");
    list.add("Philemom");
    
    System.out.println("reading fro the list:00");
    
    Iterator i =list.iterator();
    while(i.hasNext())
    {
    System.out.println(i.next());
    }
    }
}
