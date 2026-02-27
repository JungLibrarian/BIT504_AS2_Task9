
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enger your first name: ");
        String fName = scanner.next();
        
        System.out.println("Enger your last name: ");
        String lName = scanner.next();
        
        System.out.println("Hello, " + fName + " " + lName);
        
        scanner.close();

	}

}
