import java.util.Scanner;
import javax.swing.JOptionPane;

public class UserDataOnArray {
	
	public static void main(String[] args) {
		
		String [] arrayOfStrings = new String [5];

		String name = JOptionPane.showInputDialog("Please enter your name: ");
		arrayOfStrings [0] = name;
		
		String age = JOptionPane.showInputDialog("Please enter your age: ");
		arrayOfStrings [1] = age;

		String email = JOptionPane.showInputDialog("Please enter your e-mail: ");
		arrayOfStrings [2] = email;

		String faculty = JOptionPane.showInputDialog("Please enter your faculty: ");
		arrayOfStrings [3] = faculty;

		String department = JOptionPane.showInputDialog("Please enter your department: ");
		arrayOfStrings [4] = department;
		
		String print = ("Your Name is: "+name +"\n"+ "Your Age Is: "+age +"\n"+ "Your e-mail IS: "+email +"\n"+ "Your Faculty IS: "+faculty +"\n"+ "Your department Is: "+department);

        JOptionPane.showMessageDialog(null, print);


	}

}
