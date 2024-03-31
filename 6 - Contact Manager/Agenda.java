<<<<<<< HEAD

import java.util.Scanner;
import java.util.ArrayList;

public class Agenda {

	// Iniciando o Scanner
	Scanner input = new Scanner(System.in);
	// Iniciando a ArrayList que irá armazenar todos os contatos criados
	ArrayList<Contact> contacts = new ArrayList<>();

	// Classe aninhada dentro da agenda - Contém todas as informações de contato
	private class Contact {
		
		private String name;
		private String number;

		public String getName() { return name; }
		public String getNumber() { return number; }

		Contact(String name, String number) {
			this.name = name;
			this.number = number;
		}

	}

	// Método para printar lista de contatos
	public void showContacts() {
		System.out.println("\n=================================");
		if(contacts.size() == 0) {
			System.out.println("\nLista Vazia!\n");
			System.out.println("=================================");
			return;
		}
		else {
			for(int i = 0; i < contacts.size(); i++) {
				System.out.printf("| [%d] %s\n", i+1, contacts.get(i).getName());
			}
		}
		System.out.println("=================================\n");
	}
	
	// Método para adicionar contatos
	public void addContact() {

		System.out.print("Nome do Contato: ");
		String name = input.nextLine();

		String number;
		do {
			System.out.print("Número de Contato: ");
			number = input.nextLine();
		} while(!numberValidation(number));

		contacts.add(new Contact(name, number));

	}

	// Método para remover contatos
	public void removeContact() {

		if(contacts.size() == 0){
			System.out.println("Lista de Contatos Vazia!");
			return;
		}

		int removeOption = -1;
		int contactIndex;

		showContacts();
		System.out.println("[0] Voltar");

		System.out.println("-----------------------------");
		do {
			System.out.print("Selecionar contato para remover: ");
			removeOption = input.nextInt();
		} while(removeOption < 0 || removeOption > contacts.size());

		if(removeOption == 0) {
			return;
		}
		
		contactIndex = removeOption - 1;

		contacts.remove(contactIndex);

		System.out.println("Contato removido!");

	}

	public void searchContact() {

		System.out.println("=================================");
		if(contacts.size() == 0) {
			System.out.println("Lista de Contatos Vazia!");
			System.out.println("=================================");
			return;
		}

		System.out.print("Digite o nome do contato: ");
		String nameSearch = input.nextLine();

		for(Contact contact : contacts) {
			if(contact.getName().equals(nameSearch)) {
				System.out.println("Contato encontrado!");
				System.out.println("=================================");
				return;
			}
		}
		System.out.println("Contato não encontrado!");
		System.out.println("=================================");
	}
	
	// Método para verificar se número inserido é válido (Tirando o DDD, o primeiro número tem que ser 9)
	private boolean numberValidation(String number) {
		if(number != null && number.length() == 11 && number.charAt(2) == '9'){
			return true;
		}
		return false;
	}

}
=======

import java.util.Scanner;
import java.util.ArrayList;

public class Agenda {

	// Iniciando o Scanner
	Scanner input = new Scanner(System.in);
	// Iniciando a ArrayList que irá armazenar todos os contatos criados
	ArrayList<Contact> contacts = new ArrayList<>();

	// Classe aninhada dentro da agenda - Contém todas as informações de contato
	private class Contact {
		
		private String name;
		private String number;

		public String getName() { return name; }
		public String getNumber() { return number; }

		Contact(String name, String number) {
			this.name = name;
			this.number = number;
		}

	}

	// Método para printar lista de contatos
	public void showContacts() {
		System.out.println("\n=================================");
		if(contacts.size() == 0) {
			System.out.println("\nLista Vazia!\n");
			System.out.println("=================================");
			return;
		}
		else {
			for(int i = 0; i < contacts.size(); i++) {
				System.out.printf("| [%d] %s\n", i+1, contacts.get(i).getName());
			}
		}
		System.out.println("=================================\n");
	}
	
	// Método para adicionar contatos
	public void addContact() {

		System.out.print("Nome do Contato: ");
		String name = input.nextLine();

		String number;
		do {
			System.out.print("Número de Contato: ");
			number = input.nextLine();
		} while(!numberValidation(number));

		contacts.add(new Contact(name, number));

	}

	// Método para remover contatos
	public void removeContact() {

		if(contacts.size() == 0){
			System.out.println("Lista de Contatos Vazia!");
			return;
		}

		int removeOption = -1;
		int contactIndex;

		showContacts();
		System.out.println("[0] Voltar");

		System.out.println("-----------------------------");
		do {
			System.out.print("Selecionar contato para remover: ");
			removeOption = input.nextInt();
		} while(removeOption < 0 || removeOption > contacts.size());

		if(removeOption == 0) {
			return;
		}
		
		contactIndex = removeOption - 1;

		contacts.remove(contactIndex);

		System.out.println("Contato removido!");

	}

	public void searchContact() {

		System.out.println("=================================");
		if(contacts.size() == 0) {
			System.out.println("Lista de Contatos Vazia!");
			System.out.println("=================================");
			return;
		}

		System.out.print("Digite o nome do contato: ");
		String nameSearch = input.nextLine();

		for(Contact contact : contacts) {
			if(contact.getName().equals(nameSearch)) {
				System.out.println("Contato encontrado!");
				System.out.println("=================================");
				return;
			}
		}
		System.out.println("Contato não encontrado!");
		System.out.println("=================================");
	}
	
	// Método para verificar se número inserido é válido (Tirando o DDD, o primeiro número tem que ser 9)
	private boolean numberValidation(String number) {
		if(number != null && number.length() == 11 && number.charAt(2) == '9'){
			return true;
		}
		return false;
	}

}
>>>>>>> 9ddf1804665718c759acde12b88d80fc117862f6
