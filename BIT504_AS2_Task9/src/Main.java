
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		// ask first name
        System.out.println("Enger your first name:  ");
        String fName = scanner.next();
        
        // ask last name        
        System.out.println("Enger your last name:  ");
        String lName = scanner.next();
        
        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        
        // output first name and last name
        System.out.println("Welcome");
        System.out.println("Hello, " + fName + " " + lName);
        // output the user's age
        System.out.println("You are " + age + " years old.");
        
        
        scanner.close();

	}

}
