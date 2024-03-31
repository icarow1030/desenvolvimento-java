<<<<<<< HEAD

import java.util.Scanner;
import java.util.ArrayList;

public class Operations {

	Scanner input = new Scanner(System.in);
	
	// Variables
	private double num1;
	private double num2;
	private char operationType;
	private double result;
	
	// Initializing the calculator register
	private String operationRegister = "==> ";
	
	// Empty Constructor
	Operations(){
		
	}
	
	// Method that scan the two first numbers
	void scanInitialNumbers() {
		
		// Scanning Number 1
		System.out.print("Number: ");
		num1 = Double.parseDouble(input.nextLine());
		operationRegister = operationRegister + " " + num1;
		System.out.println(operationRegister);
		
		// Scanning Operator
		System.out.print("Operation: ");
		operationType = input.nextLine().charAt(0);
		operationRegister = operationRegister + " " + operationType;
		System.out.println(operationRegister);
		
		// Scanning Number 2
		System.out.print("Number: ");
		num2 = Double.parseDouble(input.nextLine());
		
		// Checking if the operator and the number are negative, to prevent "--"
		if(num2 < 0 && operationType == '-') {
			operationRegister = operationRegister + " (" + num2 + ")";
		}
		else {
			operationRegister = operationRegister + " " + num2;
		}
		System.out.println(operationRegister);
		
		calculate();
	}
	
	// The rest of the operation
	void scanOperator() {
		
		// After asking the number 2, the program asks the operator
		// If the user input "=", the program will show the result.
		System.out.print("Operation: ");
		operationType = input.nextLine().charAt(0);
		// Registering the operation into the String
		operationRegister = operationRegister + " " + operationType;
		
		System.out.println(operationRegister);
		
		if(operationType == '=') {
			calculate();
		}
		else {
		
			// If the current operation isn't ended, the program continues asking a new number
			System.out.print("Number: ");
			num2 = Double.parseDouble(input.nextLine());
			
			if(num2 < 0 && operationType == '-') {
				// Registering the operation into the String
				operationRegister = operationRegister + " (" + num2 + ")";
			}
			else {
				// Registering the operation into the String
				operationRegister = operationRegister + " " + num2;
			}
			System.out.println(operationRegister);
		
			calculate();
		}
	}
	
	void calculate() {
		
		switch(operationType) {
			case '+':
				result = num1 + num2;
				num1 = result;
				break;
			case '-':
				result = num1 - num2;
				num1 = result;
				break;
			case 'x':
				result = num1 * num2;
				num1 = result;
				break;
			case '/':
				result = num1 / num2;
				num1 = result;
				break;
			case '=':
				// Registering the operation into the String
				operationRegister = operationRegister + " " + result;
				System.out.println(operationRegister);
				break;
			default:
				
		}
		
	}
	
	boolean verifyEnd() {
		if(operationType == '=') {
			return true;
		}
		else {
			return false;
		}
	}
	
}
=======

import java.util.Scanner;
import java.util.ArrayList;

public class Operations {

	Scanner input = new Scanner(System.in);
	
	// Variables
	private double num1;
	private double num2;
	private char operationType;
	private double result;
	
	// Initializing the calculator register
	private String operationRegister = "==> ";
	
	// Empty Constructor
	Operations(){
		
	}
	
	// Method that scan the two first numbers
	void scanInitialNumbers() {
		
		// Scanning Number 1
		System.out.print("Number: ");
		num1 = Double.parseDouble(input.nextLine());
		operationRegister = operationRegister + " " + num1;
		System.out.println(operationRegister);
		
		// Scanning Operator
		System.out.print("Operation: ");
		operationType = input.nextLine().charAt(0);
		operationRegister = operationRegister + " " + operationType;
		System.out.println(operationRegister);
		
		// Scanning Number 2
		System.out.print("Number: ");
		num2 = Double.parseDouble(input.nextLine());
		
		// Checking if the operator and the number are negative, to prevent "--"
		if(num2 < 0 && operationType == '-') {
			operationRegister = operationRegister + " (" + num2 + ")";
		}
		else {
			operationRegister = operationRegister + " " + num2;
		}
		System.out.println(operationRegister);
		
		calculate();
	}
	
	// The rest of the operation
	void scanOperator() {
		
		// After asking the number 2, the program asks the operator
		// If the user input "=", the program will show the result.
		System.out.print("Operation: ");
		operationType = input.nextLine().charAt(0);
		// Registering the operation into the String
		operationRegister = operationRegister + " " + operationType;
		
		System.out.println(operationRegister);
		
		if(operationType == '=') {
			calculate();
		}
		else {
		
			// If the current operation isn't ended, the program continues asking a new number
			System.out.print("Number: ");
			num2 = Double.parseDouble(input.nextLine());
			
			if(num2 < 0 && operationType == '-') {
				// Registering the operation into the String
				operationRegister = operationRegister + " (" + num2 + ")";
			}
			else {
				// Registering the operation into the String
				operationRegister = operationRegister + " " + num2;
			}
			System.out.println(operationRegister);
		
			calculate();
		}
	}
	
	void calculate() {
		
		switch(operationType) {
			case '+':
				result = num1 + num2;
				num1 = result;
				break;
			case '-':
				result = num1 - num2;
				num1 = result;
				break;
			case 'x':
				result = num1 * num2;
				num1 = result;
				break;
			case '/':
				result = num1 / num2;
				num1 = result;
				break;
			case '=':
				// Registering the operation into the String
				operationRegister = operationRegister + " " + result;
				System.out.println(operationRegister);
				break;
			default:
				
		}
		
	}
	
	boolean verifyEnd() {
		if(operationType == '=') {
			return true;
		}
		else {
			return false;
		}
	}
	
}
>>>>>>> 9ddf1804665718c759acde12b88d80fc117862f6
