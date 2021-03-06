
import javax.swing.JOptionPane;

public class TheSecondQuestion {

	public static void main(String[] args) {

		String userGrade = JOptionPane.showInputDialog("Please Enter Your Garde: A, B, C, D, F");

		switch (userGrade.toLowerCase()) {
		case "f":
			JOptionPane.showInputDialog(null, "This Garde starts from 0 - 50");

			break;

		case "d":
			JOptionPane.showInputDialog(null, "This Garde starts from of 50 - 65");

			break;

		case "c":
			JOptionPane.showInputDialog(null, "This Garde starts from 65 - 75");

			break;

		case "b":
			JOptionPane.showInputDialog(null, "This Garde starts from 65 - 75");

			break;

		case "a":
			JOptionPane.showInputDialog(null, "This Garde starts from 85 - 100");

			break;

		default:
			JOptionPane.showInputDialog(null, "Please Enter a valid garde");

			break;
		}

	}

}
