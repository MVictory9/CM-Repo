import java.util.Scanner;

public class ThirdQuotation {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Please Enter 1st Number: ");
	int num1=input.nextInt();
	
	System.out.println("Please Enter 2nd Number: ");
	int num2=input.nextInt();
	
	num1+=num2;
	System.out.println("The Result of Addition "+num1);
	
	num1-=num2;
	System.out.println("The Result of Subtraction "+num1);
	
	num1*=num2;
	System.out.println("The Result of Multiplication "+num1);
	
	num1/=num2;
	System.out.println("The Result of Division "+num2);
	
	num1%=num2;
	System.out.println("The Result of Modulus "+num1);
	
	
}
	
}
