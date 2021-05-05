/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
/**
 *
 * @author FELICIA
 */
public class showWin {
   public static void main(String[] args)
   {
   final int WIDTH=350;
   final int HEIGHT=350;
   
   JFrame win=new JFrame();//Create new window
   
   win.setTitle("Student Entry Requirements");//set the title
   win.setSize(WIDTH, HEIGHT);//set the size
   win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   win.setVisible(true);//display the window
   }
}
