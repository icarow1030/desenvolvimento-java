<<<<<<< HEAD


/* Cada livro será criado em um objeto Book, e cada objeto será armazenado dentro da lista Library. 
 * Para acessar os livros, terá um for com o número de livros e ele irá printar todos os nomes de livros
 * e um input para escolher o livro para ver a info ou editar.
 */


// MY LIBRARY

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables, List
		int menu = -1;
		int menuBookList = -1;
		int bookQuantity = 0;
		ArrayList<Book> library = new ArrayList<Book>();

		// My Library Main Menu
		do {

			Menu.mainMenu();
			System.out.print("= Input: ");
			menu = input.nextInt();
			System.out.println("=======================================================================");

			switch(menu){

			case 1:
				Book theBook = new Book(bookQuantity);

				theBook.addInfo();

				library.add(theBook);

				bookQuantity++;
				
				break;
				
			case 2:

				if(library.size() == 0){
					System.out.println("Empty Library!");
					break;
				}
				else {
					System.out.println("BOOKS:");
					
					for(int i = 0; i < library.size(); i++){
						library.get(i).showNameList(library.size(), i);
					}
					
					Menu.bookListMenu();
					
					System.out.print("= Input: ");
					menuBookList = input.nextInt();

					switch(menuBookList){
					
					case 1:
						System.out.print("== Escolha o livro: ");
						menuBookList = input.nextInt();
						for(int i = 0; i < library.size(); i++){
							if(menuBookList == library.get(i).getCode()){
								library.get(i).showInfo();

								System.out.print("Digite qualquer coisa para continuar: ");
								input.next();
								break;
							}
						}

					case 2: break;

					default: break;
					}
				}

			default:

			}

		} while(menu != 0);

		// Closing Scanner
		input.close();
	}

=======


/* Cada livro será criado em um objeto Book, e cada objeto será armazenado dentro da lista Library. 
 * Para acessar os livros, terá um for com o número de livros e ele irá printar todos os nomes de livros
 * e um input para escolher o livro para ver a info ou editar.
 */


// MY LIBRARY

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables, List
		int menu = -1;
		int menuBookList = -1;
		int bookQuantity = 0;
		ArrayList<Book> library = new ArrayList<Book>();

		// My Library Main Menu
		do {

			Menu.mainMenu();
			System.out.print("= Input: ");
			menu = input.nextInt();
			System.out.println("=======================================================================");

			switch(menu){

			case 1:
				Book theBook = new Book(bookQuantity);

				theBook.addInfo();

				library.add(theBook);

				bookQuantity++;
				
				break;
				
			case 2:

				if(library.size() == 0){
					System.out.println("Empty Library!");
					break;
				}
				else {
					System.out.println("BOOKS:");
					
					for(int i = 0; i < library.size(); i++){
						library.get(i).showNameList(library.size(), i);
					}
					
					Menu.bookListMenu();
					
					System.out.print("= Input: ");
					menuBookList = input.nextInt();

					switch(menuBookList){
					
					case 1:
						System.out.print("== Escolha o livro: ");
						menuBookList = input.nextInt();
						for(int i = 0; i < library.size(); i++){
							if(menuBookList == library.get(i).getCode()){
								library.get(i).showInfo();

								System.out.print("Digite qualquer coisa para continuar: ");
								input.next();
								break;
							}
						}

					case 2: break;

					default: break;
					}
				}

			default:

			}

		} while(menu != 0);

		// Closing Scanner
		input.close();
	}

>>>>>>> 9ddf1804665718c759acde12b88d80fc117862f6
}