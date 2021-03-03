import javax.swing.JOptionPane;

public class TheSixthQuestion {

	public static void main(String[] args) {

		char operation;
		double result = 0;

		String input1 = JOptionPane.showInputDialog("Please Enter 1st Number: ");
		int num1 = Integer.parseInt(input1);

		String input2 = JOptionPane.showInputDialog("Please Enter 2nd Number: ");
		int num2 = Integer.parseInt(input2);

		String input3 = JOptionPane.showInputDialog("Please select the operstion: +, -, *, /, % ");
		operation = input3.charAt(0);

		switch (operation) {

		case '+':
			result = num1 + num2;
			break;

		case '-':
			result = num1 - num2;
			break;

		case '*':
			result = num1 * num2;
			break;

		case '/':
			result = num1 / num2;
			break;

		case '%':
			result = num1 % num2;
			break;
		}

		JOptionPane.showMessageDialog(null, "The result of : " + num1 + " " + operation + " " + num2 + " = " + result);

	}

}
