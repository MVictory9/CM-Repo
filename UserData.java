import java.util.Scanner;

public class UserData{
	
    public static void main(String args[]){
    	        
    	Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your Email:");
        String email =sc.next();
        System.out.println("Enter your faculty:");
        String faculty=sc.next();
        
        System.out.println("Your Name is: " +name);
        System.out.println("Your Age is: "+age);
        System.out.println("Your Email is: "+email);
        System.out.println("Your Faculty is: "+faculty);
    }
}