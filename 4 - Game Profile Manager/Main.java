<<<<<<< HEAD
package profiles;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	// Store Players

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// List
		ArrayList<Player> players = new ArrayList<>();
		
		// Variables
		int menuOption = -1;
		int subMenuOption = -1;
		String username; // Input to username
		boolean usernameAvailable; // Username Verifier 
		
		do {
			
			System.out.println("---------------------------------------------------------------------");
			System.out.println("======================\nGAME PROFILE MANAGER\n======================");
			System.out.println("[1] Novo Jogador");
			System.out.println("[2] Entrar na Conta");
			System.out.println("[0] Sair");
			System.out.println("------------------");
			System.out.print("Input: ");
			menuOption = input.nextInt();
			input.nextLine();
			
			switch(menuOption) {
			case 1:
				
				System.out.println("---------------------------------------------------------------------");
				System.out.println("------------------\nNOVO JOGADOR\n------------------");
				
				do {
					usernameAvailable = true;
					System.out.print("New Username: ");
					username = input.next();
					input.nextLine();
					
					// Verify if username is available
					for(Player player : players) {
						if(player.getUsername().equals("@" + username)) {
							// Username already used
							usernameAvailable = false;
							System.out.println("Nome de usuário indisponível!");
							break;
						}
					}
					
				} while(!usernameAvailable);
				
				players.add(new Player(username));
				
				System.out.println("------------------\n");
				System.out.println("Username: " + players.get(players.size() - 1).getUsername());
				System.out.println("Score: " + players.get(players.size() - 1).getScore());
				System.out.println("Level: " + players.get(players.size() - 1).getLevel() + "\n");
				
				break;
				
			case 2:
				if(players.size() == 0) {
					System.out.println("Nenhuma conta registrada!\n");
					break;
				}
				
				System.out.println("---------------------------------------------------------------------");
				System.out.println("------------------\nENTRAR NA CONTA\n------------------");
				
				int playerIndex;
				
				do {
					usernameAvailable = false;
					playerIndex = 0;
					System.out.print("Username (Sem @): ");
					username = input.next();
					input.nextLine();
					
					for(Player player : players) {
						if(player.getUsername().equals("@" + username)) {
							usernameAvailable = true;
							break;
						}
						playerIndex++;
					}
				} while(!usernameAvailable);
				
				do {
					
					System.out.println("---------------------------------------------------------------------");
					System.out.println("------------------");
					System.out.println("Username: " + players.get(playerIndex).getUsername());
					System.out.println("Score: " + players.get(playerIndex).getScore());
					System.out.println("Level: " + players.get(playerIndex).getLevel() + "(" + players.get(playerIndex).getRank() + ")");
					System.out.println("------------------");
					System.out.println("[1] Aumentar Score");
					System.out.println("[2] Diminuir Score");
					System.out.println("[3] Aumentar Level");
					System.out.println("[4] Diminuir Level");
					System.out.println("[0] Voltar");
					System.out.println("------------------");
					System.out.print("Input: ");
					subMenuOption = input.nextInt();
					input.nextLine();
					
					switch(subMenuOption) {
					
					case 1:
						players.get(playerIndex).scoreUp();
						players.get(playerIndex).showInfo();
						break;
					case 2:
						players.get(playerIndex).scoreDown();
						players.get(playerIndex).showInfo();
						break;
					case 3:
						players.get(playerIndex).levelUp();
						players.get(playerIndex).showInfo();
						break;
					case 4:
						players.get(playerIndex).levelDown();
						players.get(playerIndex).showInfo();
						break;
					case 0:
						break;
					default:
						break;
					}
					
				} while(subMenuOption != 0);
				
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				break;
			}
			
		} while(menuOption != 0);
	}
}
=======
package profiles;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	// Store Players

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// List
		ArrayList<Player> players = new ArrayList<>();
		
		// Variables
		int menuOption = -1;
		int subMenuOption = -1;
		String username; // Input to username
		boolean usernameAvailable; // Username Verifier 
		
		do {
			
			System.out.println("---------------------------------------------------------------------");
			System.out.println("======================\nGAME PROFILE MANAGER\n======================");
			System.out.println("[1] Novo Jogador");
			System.out.println("[2] Entrar na Conta");
			System.out.println("[0] Sair");
			System.out.println("------------------");
			System.out.print("Input: ");
			menuOption = input.nextInt();
			input.nextLine();
			
			switch(menuOption) {
			case 1:
				
				System.out.println("---------------------------------------------------------------------");
				System.out.println("------------------\nNOVO JOGADOR\n------------------");
				
				do {
					usernameAvailable = true;
					System.out.print("New Username: ");
					username = input.next();
					input.nextLine();
					
					// Verify if username is available
					for(Player player : players) {
						if(player.getUsername().equals("@" + username)) {
							// Username already used
							usernameAvailable = false;
							System.out.println("Nome de usuário indisponível!");
							break;
						}
					}
					
				} while(!usernameAvailable);
				
				players.add(new Player(username));
				
				System.out.println("------------------\n");
				System.out.println("Username: " + players.get(players.size() - 1).getUsername());
				System.out.println("Score: " + players.get(players.size() - 1).getScore());
				System.out.println("Level: " + players.get(players.size() - 1).getLevel() + "\n");
				
				break;
				
			case 2:
				if(players.size() == 0) {
					System.out.println("Nenhuma conta registrada!\n");
					break;
				}
				
				System.out.println("---------------------------------------------------------------------");
				System.out.println("------------------\nENTRAR NA CONTA\n------------------");
				
				int playerIndex;
				
				do {
					usernameAvailable = false;
					playerIndex = 0;
					System.out.print("Username (Sem @): ");
					username = input.next();
					input.nextLine();
					
					for(Player player : players) {
						if(player.getUsername().equals("@" + username)) {
							usernameAvailable = true;
							break;
						}
						playerIndex++;
					}
				} while(!usernameAvailable);
				
				do {
					
					System.out.println("---------------------------------------------------------------------");
					System.out.println("------------------");
					System.out.println("Username: " + players.get(playerIndex).getUsername());
					System.out.println("Score: " + players.get(playerIndex).getScore());
					System.out.println("Level: " + players.get(playerIndex).getLevel() + "(" + players.get(playerIndex).getRank() + ")");
					System.out.println("------------------");
					System.out.println("[1] Aumentar Score");
					System.out.println("[2] Diminuir Score");
					System.out.println("[3] Aumentar Level");
					System.out.println("[4] Diminuir Level");
					System.out.println("[0] Voltar");
					System.out.println("------------------");
					System.out.print("Input: ");
					subMenuOption = input.nextInt();
					input.nextLine();
					
					switch(subMenuOption) {
					
					case 1:
						players.get(playerIndex).scoreUp();
						players.get(playerIndex).showInfo();
						break;
					case 2:
						players.get(playerIndex).scoreDown();
						players.get(playerIndex).showInfo();
						break;
					case 3:
						players.get(playerIndex).levelUp();
						players.get(playerIndex).showInfo();
						break;
					case 4:
						players.get(playerIndex).levelDown();
						players.get(playerIndex).showInfo();
						break;
					case 0:
						break;
					default:
						break;
					}
					
				} while(subMenuOption != 0);
				
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				break;
			}
			
		} while(menuOption != 0);
	}
}
>>>>>>> 9ddf1804665718c759acde12b88d80fc117862f6
