
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		// ask first name
        System.out.println("Enger your first name: ");
        String fName = scanner.next();
        
        // ask last name        
        System.out.println("Enger your last name: ");
        String lName = scanner.next();
        
        // output first name and last name
        System.out.println("Hello, " + fName + " " + lName);
        
        scanner.close();

	}

}
