import java.util.Scanner;

public class PrintPyramid {
	public static void main(String args[]) {

		int numberofrows;

		System.out.print("Please Enter pyramids number of rows: ");
		try (Scanner sc = new Scanner(System.in)) {
			numberofrows = sc.nextInt();
		}
		
		for (int rows = 1; rows <= numberofrows; ++rows) {
			for (int colum = 1; colum <= rows; ++colum) {
				System.out.print("^ ");
			}
			System.out.println();
		}
	}
}
