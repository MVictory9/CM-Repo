import java.util.Scanner;

public class FirstQuotation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter 1st Number: ");
		int num1=input.nextInt();
		
		System.out.println("Please Enter 2nd Number: ");
		int num2=input.nextInt();
		
		int Add = num1 + num2;
		int Sub = num1 - num2;
		int Mult = num1 * num2;
		int Div = num1 / num2;
		int Mod = num1 % num2;

		System.out.println("The Result of Addition "+Add);
		System.out.println("The Result of Subtraction "+Sub);
		System.out.println("The Result of Multiplication "+Mult);
		System.out.println("The Result of Division "+Div);
		System.out.println("The Result of Modulus  "+Mod);

		
	}

}
