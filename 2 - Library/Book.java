<<<<<<< HEAD

import java.util.Scanner;

public class Book {

	Scanner input = new Scanner(System.in);

	private int code;
	private String name;
	private String publishYear;
	private String author;
	private boolean read;

	Book(int bookQuantity){
		code = bookQuantity + 1;
	}

	void addInfo(){

		char readCheck;

		System.out.print("Book Name: ");
		name = input.nextLine();

		System.out.print("Author: ");
		author = input.nextLine();

		do {
			System.out.print("Publishing Year: ");
			publishYear = input.nextLine();
		} while(!isValidPublishingYear(publishYear));

		do {
			System.out.print("Read Status (yes/no): ");
			readCheck = input.nextLine().charAt(0);
		} while(readCheck != 'n' && readCheck != 'y');

		if(readCheck == 'n'){
			read = false;
		}
		else if(readCheck == 'y'){
			read = true;
		}
		else {
			System.out.println("Error");
		}

		System.out.println("=======================================================================");
		System.out.println("Name: " + name);
		System.out.println("Author: " + author);
		System.out.println("Publishing Year: " + publishYear);
		System.out.println("Status: " + read);

	}

	void showInfo(){

		System.out.println("=======================================================================");
		System.out.println("| " + name + " |");
		System.out.println("Author: " + author);
		System.out.println("Publishing Year: " + publishYear);
		System.out.println("Description: ##########################################################\n");
		System.out.println("=======================================================================");

	}

	void showNameList(int librarySize, int i){
		System.out.printf("[%d] %s (%s)\n", i+1, name, publishYear);
	}
	
	boolean isValidPublishingYear(String publishingYear) {
        return publishingYear != null && publishingYear.matches("\\d+");
    }

	int getCode(){
		return code;
	}

}
=======

import java.util.Scanner;

public class Book {

	Scanner input = new Scanner(System.in);

	private int code;
	private String name;
	private String publishYear;
	private String author;
	private boolean read;

	Book(int bookQuantity){
		code = bookQuantity + 1;
	}

	void addInfo(){

		char readCheck;

		System.out.print("Book Name: ");
		name = input.nextLine();

		System.out.print("Author: ");
		author = input.nextLine();

		do {
			System.out.print("Publishing Year: ");
			publishYear = input.nextLine();
		} while(!isValidPublishingYear(publishYear));

		do {
			System.out.print("Read Status (yes/no): ");
			readCheck = input.nextLine().charAt(0);
		} while(readCheck != 'n' && readCheck != 'y');

		if(readCheck == 'n'){
			read = false;
		}
		else if(readCheck == 'y'){
			read = true;
		}
		else {
			System.out.println("Error");
		}

		System.out.println("=======================================================================");
		System.out.println("Name: " + name);
		System.out.println("Author: " + author);
		System.out.println("Publishing Year: " + publishYear);
		System.out.println("Status: " + read);

	}

	void showInfo(){

		System.out.println("=======================================================================");
		System.out.println("| " + name + " |");
		System.out.println("Author: " + author);
		System.out.println("Publishing Year: " + publishYear);
		System.out.println("Description: ##########################################################\n");
		System.out.println("=======================================================================");

	}

	void showNameList(int librarySize, int i){
		System.out.printf("[%d] %s (%s)\n", i+1, name, publishYear);
	}
	
	boolean isValidPublishingYear(String publishingYear) {
        return publishingYear != null && publishingYear.matches("\\d+");
    }

	int getCode(){
		return code;
	}

}
>>>>>>> 9ddf1804665718c759acde12b88d80fc117862f6
