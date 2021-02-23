import java.util.Scanner;

public class SecondQuotation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter 1st Number: ");
		int num1=input.nextInt();
		
		System.out.println("Please Enter 2nd Number: ");
		int num2=input.nextInt();
		
		boolean result = num1 > num2;
		System.out.println("Number1 > Number2: "+result);
		
		result = num1 < num2;
		System.out.println("Number1 < Number2: "+result);
		
		result = num1 >= num2;
		System.out.println("Number1 >= Number2: "+result);
		
		result = num1 <= num2;
		System.out.println("Number1 <= Number2: "+result);
		
		result = num1 == num2;
		System.out.println("Number1 = Number2: "+result);
		
		result = num1 != num2;
		System.out.println("Number1 != Number2: "+result);
		
		
		
}

	
}
