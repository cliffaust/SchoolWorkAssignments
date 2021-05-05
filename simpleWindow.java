package graphicalExamples;

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
public class simpleWindow extends JFrame{
    public simpleWindow()
    {
    final int WIDTH=350;
   final int HEIGHT=350;
   
   setTitle("STUDENT NEW WINDOW");//set the title
   setSize(WIDTH, HEIGHT);//set the size
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setVisible(true);//display the window
    }
            
}
