<<<<<<< HEAD

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Scanner
		Scanner input = new Scanner(System.in);
		
		// ArrayList
		ArrayList<Operations> calculatorRegister = new ArrayList<Operations>();
		
		// Menu
		int menu = -1;
		do {
			
			// Printing the Program logo
			Menu.printCalculatorLogo();
			// Printing the Program Main Menu (Two Options)
			Menu.printMenu();
			// Input the Option
			System.out.print("= Input: ");
			menu = Integer.parseInt(input.nextLine());
			
			// Menu Option Switch
			switch(menu) {
			
				case 1:
					
					// Creating the new Operation Object
					Operations operation = new Operations();
					
					// Calling Static Method from Menu Class to print 
					Menu.printCalculatorLogo();
					Menu.printCalculatorInterface();
					
					// First Part: Scanning the two first numbers of the Operation
					operation.scanInitialNumbers();
					
					// Calculating until the user requests the result, using "="
					do {
						operation.scanOperator();
					} while(!operation.verifyEnd()); // VerifyEnd is a boolean method
					
					// Add operation to a list, so the program can save the operation history
					calculatorRegister.add(operation);
					
					break;
					
				case 2:
					// Program ending message 
					System.out.println("Flw, meu patrão!");
					break;
					
				default:
					System.out.println("Invalid Option!");
					break;
			
			}
			
		} while(menu != 2);
		
	}

}
=======

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Scanner
		Scanner input = new Scanner(System.in);
		
		// ArrayList
		ArrayList<Operations> calculatorRegister = new ArrayList<Operations>();
		
		// Menu
		int menu = -1;
		do {
			
			// Printing the Program logo
			Menu.printCalculatorLogo();
			// Printing the Program Main Menu (Two Options)
			Menu.printMenu();
			// Input the Option
			System.out.print("= Input: ");
			menu = Integer.parseInt(input.nextLine());
			
			// Menu Option Switch
			switch(menu) {
			
				case 1:
					
					// Creating the new Operation Object
					Operations operation = new Operations();
					
					// Calling Static Method from Menu Class to print 
					Menu.printCalculatorLogo();
					Menu.printCalculatorInterface();
					
					// First Part: Scanning the two first numbers of the Operation
					operation.scanInitialNumbers();
					
					// Calculating until the user requests the result, using "="
					do {
						operation.scanOperator();
					} while(!operation.verifyEnd()); // VerifyEnd is a boolean method
					
					// Add operation to a list, so the program can save the operation history
					calculatorRegister.add(operation);
					
					break;
					
				case 2:
					// Program ending message 
					System.out.println("Flw, meu patrão!");
					break;
					
				default:
					System.out.println("Invalid Option!");
					break;
			
			}
			
		} while(menu != 2);
		
	}

}
>>>>>>> 9ddf1804665718c759acde12b88d80fc117862f6
