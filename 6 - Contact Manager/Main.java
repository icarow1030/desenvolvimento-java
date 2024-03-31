<<<<<<< HEAD

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Objetos
		Scanner input = new Scanner(System.in);
		Agenda agenda = new Agenda();

		// Variáveis
		int menuOption = -1;

		// Menu Principal
		// [1] Ver Contatos
		// [2] Buscar Contato
		// [3] Adicionar Contato
		// [4] Remover Contato
		do {

			System.out.println("-----------------------------");
			System.out.println("[1] Ver Contatos");
			System.out.println("[2] Buscar Contato");
			System.out.println("[3] Adiiconar Contato");
			System.out.println("[4] Remover Contato");
			System.out.println("[0] Voltar");
			System.out.println("-----------------------------");
			System.out.print("= Input: ");
			menuOption = input.nextInt();

			switch(menuOption) {
				case 1:
					agenda.showContacts();
					break;
				case 2:
					agenda.searchContact();
					break;
				case 3:
					agenda.addContact();
					break;
				case 4:
					agenda.removeContact();
					break;
				case 0:
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}

		} while(menuOption != 0);

	}

}
=======

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Objetos
		Scanner input = new Scanner(System.in);
		Agenda agenda = new Agenda();

		// Variáveis
		int menuOption = -1;

		// Menu Principal
		// [1] Ver Contatos
		// [2] Buscar Contato
		// [3] Adicionar Contato
		// [4] Remover Contato
		do {

			System.out.println("-----------------------------");
			System.out.println("[1] Ver Contatos");
			System.out.println("[2] Buscar Contato");
			System.out.println("[3] Adiiconar Contato");
			System.out.println("[4] Remover Contato");
			System.out.println("[0] Voltar");
			System.out.println("-----------------------------");
			System.out.print("= Input: ");
			menuOption = input.nextInt();

			switch(menuOption) {
				case 1:
					agenda.showContacts();
					break;
				case 2:
					agenda.searchContact();
					break;
				case 3:
					agenda.addContact();
					break;
				case 4:
					agenda.removeContact();
					break;
				case 0:
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}

		} while(menuOption != 0);

	}

}
>>>>>>> 9ddf1804665718c759acde12b88d80fc117862f6
