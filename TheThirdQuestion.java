import java.util.Scanner;

public class TheThirdQuestion {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int number, multiplier;
			System.out.println("Please Enter the number: ");
			number = sc.nextInt();

			for (multiplier = 1; multiplier <= 12; multiplier++) {
				System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
			}
		}

	}

}
