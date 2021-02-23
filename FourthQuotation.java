import java.util.Scanner;

import javax.swing.JOptionPane;

public class FourthQuotation {

    public static void main(String args[]){
        
		String name = JOptionPane.showInputDialog("Please enter your name: ");
		String age = JOptionPane.showInputDialog("Please enter your age: ");
		String email = JOptionPane.showInputDialog("Please enter your e-mail: ");
		String faculty = JOptionPane.showInputDialog("Please enter your faculty: ");
		
		String print = ("Your Name is: "+name +"\n"+ "Your Age Is: "+age +"\n"+ "Your e-mail IS: "+email +"\n"+ "Your Faculty IS: "+faculty);

        JOptionPane.showMessageDialog(null, print);
       
    
}
    
}
