<<<<<<< HEAD
package bankSystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// Bank
		Bank bank = new Bank();
		
		// Variables
		int menuOption = -1;
		String accountNumber;
		
		// Menu
		do {
			
			System.out.println("==========\nBANCO DA UP\n==========");
			System.out.println("[1] Nova Conta");
			System.out.println("[2] Entrar na Conta");
			System.out.println("[0] Sair");
			System.out.println("---------------");
			System.out.print("= Input: ");
			menuOption = input.nextInt();
			input.nextLine();
			
			switch(menuOption) {
			
			// CRIAR NOVA CONTA
			case 1:
				bank.newAccount();
				break;
				
			// ENTRAR NA CONTA
			case 2:
				if(bank.accountsIsEmpty()) {
					break;
				}
				else {
					System.out.println("=== LOGIN ===");
					do {
						System.out.print("Número da Conta: ");
						accountNumber = input.nextLine();
					} while(!bank.verifyAccountNumber(accountNumber, false));
					
					do {
						System.out.println("---------------");
						System.out.println("[1] Depósito");
						System.out.println("[2] Saque");
						System.out.println("[3] Dados da Conta");
						System.out.println("[0] Voltar");
						System.out.println("---------------");
						System.out.print("= Input: ");
						menuOption = input.nextInt();
						input.nextLine();
						
						switch(menuOption) {
						case 1:
							bank.deposit(bank.getAccountIndex(accountNumber));
							break;
						case 2:
							bank.withdrawal(bank.getAccountIndex(accountNumber));
							break;
						case 3:
							bank.showAccountInfo(bank.getAccountIndex(accountNumber));
							break;
						case 0:
							break;
						default:
							System.out.println("Opção inválida!");
							break;
						}
					} while(menuOption != 0);
					
				}
				menuOption = -1;
				break;
			
			case 0:
				System.out.println("Saindo...");
				break;
				
			default:
				System.out.println("Opção inválida!");
				break;
		
			}
			
		} while(menuOption != 0);

		input.close();
	}

}
=======
package bankSystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// Bank
		Bank bank = new Bank();
		
		// Variables
		int menuOption = -1;
		String accountNumber;
		
		// Menu
		do {
			
			System.out.println("==========\nBANCO DA UP\n==========");
			System.out.println("[1] Nova Conta");
			System.out.println("[2] Entrar na Conta");
			System.out.println("[0] Sair");
			System.out.println("---------------");
			System.out.print("= Input: ");
			menuOption = input.nextInt();
			input.nextLine();
			
			switch(menuOption) {
			
			// CRIAR NOVA CONTA
			case 1:
				bank.newAccount();
				break;
				
			// ENTRAR NA CONTA
			case 2:
				if(bank.accountsIsEmpty()) {
					break;
				}
				else {
					System.out.println("=== LOGIN ===");
					do {
						System.out.print("Número da Conta: ");
						accountNumber = input.nextLine();
					} while(!bank.verifyAccountNumber(accountNumber, false));
					
					do {
						System.out.println("---------------");
						System.out.println("[1] Depósito");
						System.out.println("[2] Saque");
						System.out.println("[3] Dados da Conta");
						System.out.println("[0] Voltar");
						System.out.println("---------------");
						System.out.print("= Input: ");
						menuOption = input.nextInt();
						input.nextLine();
						
						switch(menuOption) {
						case 1:
							bank.deposit(bank.getAccountIndex(accountNumber));
							break;
						case 2:
							bank.withdrawal(bank.getAccountIndex(accountNumber));
							break;
						case 3:
							bank.showAccountInfo(bank.getAccountIndex(accountNumber));
							break;
						case 0:
							break;
						default:
							System.out.println("Opção inválida!");
							break;
						}
					} while(menuOption != 0);
					
				}
				menuOption = -1;
				break;
			
			case 0:
				System.out.println("Saindo...");
				break;
				
			default:
				System.out.println("Opção inválida!");
				break;
		
			}
			
		} while(menuOption != 0);

		input.close();
	}

}
>>>>>>> 9ddf1804665718c759acde12b88d80fc117862f6
