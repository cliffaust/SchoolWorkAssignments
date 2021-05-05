/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author FELICIA
 */
public class convertFrame extends JFrame{
 JPanel panel;
 private JLabel kilolabel;
private JTextField kilotext;
private JButton btn;
final int WIDTH=350;
final int HEIGHT=250;

//using the constructor
public convertFrame(){
setTitle("Some Calculations");
setSize(WIDTH,HEIGHT);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

buildPanel();

add(panel);
setVisible(true);
}

private void buildPanel(){
kilolabel =new JLabel("Enter the distance covered in Kilometers");
kilotext=new JTextField(10);//a text field for 10 characters

btn=new JButton("Calculate");
btn.addActionListener(new btnListener());

panel=new JPanel();

panel.add(kilolabel);
panel.add(kilotext);
panel.add(btn);
}

private class btnListener implements ActionListener
{
public void actionPerformed (ActionEvent e)
{
 final double CONVERSION=0.6214;
  String input;
  double miles;
  
  input= kilotext.getText();
  
  miles=Double.parseDouble(input)*CONVERSION;
  
  JOptionPane.showMessageDialog(null,input+" kilometers is "+ miles+ " miles");
}
}
public static void main(String[] args)
{
new convertFrame();
}       
}