<<<<<<< HEAD
package bankSystem;

import java.util.Scanner;
import java.util.ArrayList;

public class Bank {
	
	// Scanner
	private Scanner input = new Scanner(System.in);
	
	// List to store accounts
	private ArrayList<BankAccount> accounts;

	// Encapsulating Bank Account Info --> Security
	private class BankAccount {
		// Initializing Account
		private String accountNumber;
		private String username;
		private double balance;
		
		BankAccount(String accountNumber, String username){
			this.accountNumber = accountNumber;
			this.username = username;
			this.balance = 0.0;
		}
		
		private void withdrawalAccount(double amount) {
			this.balance -= amount;
			System.out.printf("Novo Saldo: R$%.2f", this.balance);
		}
		
		private void depositAccount(double amount) {
			this.balance += amount;
			System.out.printf("Novo Saldo: R$%.2f", this.balance);
		}
		
		private String getAccountNumber() { return accountNumber; }
		private String getAccountUsername() { return username; }
		private double getAccountBalance() { return balance; }
		
	}
	
	Bank(){
		accounts = new ArrayList<>();
	}
	
	public void newAccount() {
		String accountNumber;
		String username;
		// 1 - Ask the Info and Check Input
		// 2 - Access Private Class BankAccount to Storage Info
		System.out.println("=== NOVA CONTA ===");
		do {
			System.out.print("Número da Conta Nova: ");
			accountNumber = input.nextLine();
		} while(verifyAccountNumber(accountNumber, true) || !isNumber(accountNumber));
		
		System.out.print("Nome do Usuário: ");
		username = input.nextLine();
		
		accounts.add(new BankAccount(accountNumber, username));
		
		System.out.println("Conta criada com sucesso!");
	}
	
	public boolean verifyAccountNumber(String accountNumber, boolean printError) {
		for(BankAccount account : accounts) {
			if(account.getAccountNumber().equals(accountNumber)) {
				if(printError) {
					System.out.println("Erro: Número de Conta já existe!");
				}
				return true;
			}
		}
		if(printError == false) {
			System.out.println("Conta inexistente! Tente novamente!");
		}
		return false;
	}
	
	private boolean isNumber(String number) {
        return number != null && number.matches("\\d+");
    }
	
	public boolean accountsIsEmpty() {
		if(accounts.size() == 0) {
			System.out.println("Nenhuma conta registrada!");
			return true;
		}
		else {
			return false;
		}
	}
	
	public void showAccountInfo(int accountIndex) {
		System.out.println("=== " + accounts.get(accountIndex).getAccountUsername());
		System.out.println("=== Conta: " + accounts.get(accountIndex).getAccountNumber());
		System.out.printf("=== Saldo: R$%.2f\n", accounts.get(accountIndex).getAccountBalance());
	}
	
	public void deposit(int accountIndex) {
		double amount;
		System.out.println("=== DEPÓSITO BANCÁRIO");
		System.out.println("=== Conta: " + accounts.get(accountIndex).getAccountNumber());
		System.out.printf("=== Saldo: R$%.2f\n", accounts.get(accountIndex).getAccountBalance());
		System.out.println("-------------------------");
		System.out.print("Quantidade a depositar (R$): ");
		amount = Double.parseDouble(input.nextLine());
		accounts.get(accountIndex).depositAccount(amount);
	}
	
	public void withdrawal(int accountIndex) {
		if(accounts.get(accountIndex).getAccountBalance() == 0.0) {
			System.out.println("Sem saldo disponível para saque!");
			return;
		}
		double amount;
		System.out.println("=== SAQUE BANCÁRIO");
		System.out.println("=== Conta: " + accounts.get(accountIndex).getAccountNumber());
		System.out.printf("=== Saldo: R$%.2f\n", accounts.get(accountIndex).getAccountBalance());
		do {
			System.out.print("Quantidade a sacar (R$): ");
			amount = Double.parseDouble(input.nextLine());
			if(accounts.get(accountIndex).getAccountBalance() - amount < 0.0) {
				System.out.println("Sem saldo disponível para esse saque! Tente outro valor!");
			}
		} while(accounts.get(accountIndex).getAccountBalance() - amount < 0.0);
		accounts.get(accountIndex).withdrawalAccount(amount);
	}
	
	public int getAccountIndex(String accountNumber) {
		int count = 0;
		for(BankAccount account : accounts) {
			if(account.getAccountNumber().equals(accountNumber)) {
				return count;
			}
			count++;
		}
		return -1;
	}
}
=======
package bankSystem;

import java.util.Scanner;
import java.util.ArrayList;

public class Bank {
	
	// Scanner
	private Scanner input = new Scanner(System.in);
	
	// List to store accounts
	private ArrayList<BankAccount> accounts;

	// Encapsulating Bank Account Info --> Security
	private class BankAccount {
		// Initializing Account
		private String accountNumber;
		private String username;
		private double balance;
		
		BankAccount(String accountNumber, String username){
			this.accountNumber = accountNumber;
			this.username = username;
			this.balance = 0.0;
		}
		
		private void withdrawalAccount(double amount) {
			this.balance -= amount;
			System.out.printf("Novo Saldo: R$%.2f", this.balance);
		}
		
		private void depositAccount(double amount) {
			this.balance += amount;
			System.out.printf("Novo Saldo: R$%.2f", this.balance);
		}
		
		private String getAccountNumber() { return accountNumber; }
		private String getAccountUsername() { return username; }
		private double getAccountBalance() { return balance; }
		
	}
	
	Bank(){
		accounts = new ArrayList<>();
	}
	
	public void newAccount() {
		String accountNumber;
		String username;
		// 1 - Ask the Info and Check Input
		// 2 - Access Private Class BankAccount to Storage Info
		System.out.println("=== NOVA CONTA ===");
		do {
			System.out.print("Número da Conta Nova: ");
			accountNumber = input.nextLine();
		} while(verifyAccountNumber(accountNumber, true) || !isNumber(accountNumber));
		
		System.out.print("Nome do Usuário: ");
		username = input.nextLine();
		
		accounts.add(new BankAccount(accountNumber, username));
		
		System.out.println("Conta criada com sucesso!");
	}
	
	public boolean verifyAccountNumber(String accountNumber, boolean printError) {
		for(BankAccount account : accounts) {
			if(account.getAccountNumber().equals(accountNumber)) {
				if(printError) {
					System.out.println("Erro: Número de Conta já existe!");
				}
				return true;
			}
		}
		if(printError == false) {
			System.out.println("Conta inexistente! Tente novamente!");
		}
		return false;
	}
	
	private boolean isNumber(String number) {
        return number != null && number.matches("\\d+");
    }
	
	public boolean accountsIsEmpty() {
		if(accounts.size() == 0) {
			System.out.println("Nenhuma conta registrada!");
			return true;
		}
		else {
			return false;
		}
	}
	
	public void showAccountInfo(int accountIndex) {
		System.out.println("=== " + accounts.get(accountIndex).getAccountUsername());
		System.out.println("=== Conta: " + accounts.get(accountIndex).getAccountNumber());
		System.out.printf("=== Saldo: R$%.2f\n", accounts.get(accountIndex).getAccountBalance());
	}
	
	public void deposit(int accountIndex) {
		double amount;
		System.out.println("=== DEPÓSITO BANCÁRIO");
		System.out.println("=== Conta: " + accounts.get(accountIndex).getAccountNumber());
		System.out.printf("=== Saldo: R$%.2f\n", accounts.get(accountIndex).getAccountBalance());
		System.out.println("-------------------------");
		System.out.print("Quantidade a depositar (R$): ");
		amount = Double.parseDouble(input.nextLine());
		accounts.get(accountIndex).depositAccount(amount);
	}
	
	public void withdrawal(int accountIndex) {
		if(accounts.get(accountIndex).getAccountBalance() == 0.0) {
			System.out.println("Sem saldo disponível para saque!");
			return;
		}
		double amount;
		System.out.println("=== SAQUE BANCÁRIO");
		System.out.println("=== Conta: " + accounts.get(accountIndex).getAccountNumber());
		System.out.printf("=== Saldo: R$%.2f\n", accounts.get(accountIndex).getAccountBalance());
		do {
			System.out.print("Quantidade a sacar (R$): ");
			amount = Double.parseDouble(input.nextLine());
			if(accounts.get(accountIndex).getAccountBalance() - amount < 0.0) {
				System.out.println("Sem saldo disponível para esse saque! Tente outro valor!");
			}
		} while(accounts.get(accountIndex).getAccountBalance() - amount < 0.0);
		accounts.get(accountIndex).withdrawalAccount(amount);
	}
	
	public int getAccountIndex(String accountNumber) {
		int count = 0;
		for(BankAccount account : accounts) {
			if(account.getAccountNumber().equals(accountNumber)) {
				return count;
			}
			count++;
		}
		return -1;
	}
}
>>>>>>> 9ddf1804665718c759acde12b88d80fc117862f6
