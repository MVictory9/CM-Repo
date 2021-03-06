import javax.swing.JOptionPane;

public class TheFirstQuestion {

	public static void main(String[] args) {

		String userGrade = JOptionPane.showInputDialog("Please Enter Your Garde: fail, fair, good, very good, excellent");

		switch (userGrade.toLowerCase()) {
		case "fail":
			JOptionPane.showInputDialog(null, "Your Garde Between Range of 0 - 50");

			break;

		case "fair":
			JOptionPane.showInputDialog(null, "Your Garde Between Range of 50 - 65");

			break;

		case "good":
			JOptionPane.showInputDialog(null, "Your Garde Between Range of 65 - 75");

			break;

		case "very good":
			JOptionPane.showInputDialog(null, "Your Garde Between Range of 65 - 75");

			break;

		case "excellent":
			JOptionPane.showInputDialog(null, "Your Garde Between Range of 85 - 100");

			break;

		default:
			JOptionPane.showInputDialog(null, "Please Enter a valid garde");

			break;
		}

	}

}
