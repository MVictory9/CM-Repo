import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		
	      Scanner userInput = new Scanner(System.in);
	      int[] array = new int[5];
	      int sum = 0;
	      
	      System.out.println("Enter the 1st number: ");
    	  array[0] = userInput.nextInt();
    	  
    	  System.out.println("Enter the 2nd number: ");
    	  array[1] = userInput.nextInt();
    	  
    	  System.out.println("Enter the 3rd number: ");
    	  array[2] = userInput.nextInt();
    	  
    	  System.out.println("Enter the 4th number: ");
    	  array[3] = userInput.nextInt();
    	  
    	  System.out.println("Enter the 5th number: ");
    	  array[4] = userInput.nextInt();
    	  
    	  sum = array[0] + array[1] + array[2] + array[3] + array[4];
    	  
          System.out.println("Total of the entered numbers: "+sum);


	}
}
