<<<<<<< HEAD
package profiles;

import java.util.Scanner;

public class Player {
	
	Scanner input = new Scanner(System.in);

	private String username;
	private int score;
	private int level;
	private String rank;
	
	public String getUsername() { return username; }
	public int getScore() { return score; }
	public int getLevel() { return level; }
	public String getRank() { return rank; }
	
	private int menuOption = -1;
	
	Player(String username){
		this.username = "@" + username.trim().toLowerCase();
		this.score = 0;
		this.level = 1;
		this.rank = "Bronze";
	}
	
	public void showInfo() {
		System.out.println("Novo Score: " + score);
		System.out.println("Novo Level: " + level);
		System.out.println("Rank: " + rank);
	}
	
	private void scoreToLevel() {
		this.level = this.score / 100;
	}
	
	private void levelToScore() {
		this.score = this.level * 100;
	}
	
	public void scoreUp() {
		do {
			System.out.println("---------------------------------------------------------------------");
			setRank();
			showInfo();
			System.out.println("------------------");
			System.out.println("[1] Aumentar +100");
			System.out.println("[2] Aumentar +500");
			System.out.println("[3] Aumentar +1000");
			System.out.println("[4] Aumentar +5000");
			System.out.println("[5] Voltar");
			System.out.println("------------------");
			System.out.print("Input: ");
			menuOption = input.nextInt();
			
			switch(menuOption) {
			case 1:
				this.score += 100;
				scoreToLevel();
				break;
			case 2:
				this.score += 500;
				scoreToLevel();
				break;
			case 3:
				this.score += 1000;
				scoreToLevel();
				break;
			case 4:
				this.score += 5000;
				scoreToLevel();
				break;
			case 5:
				break;
			default:
				break;
			}
			
		} while(menuOption != 0);
	}
	
	public void scoreDown() {
		do {
			System.out.println("---------------------------------------------------------------------");
			setRank();
			showInfo();
			System.out.println("------------------");
			System.out.println("[1] Diminuir -100");
			System.out.println("[2] Diminuir -500");
			System.out.println("[3] Diminuir -1000");
			System.out.println("[4] Diminuir -5000");
			System.out.println("[5] Voltar");
			System.out.println("------------------");
			System.out.print("Input: ");
			menuOption = input.nextInt();
			
			switch(menuOption) {
			case 1:
				if(this.score - 100 < 0) {
					System.out.println("Level mínimo atingido!");
					this.level = 1;
					this.score = 0;
					break;
				}
				this.score -= 100;
				scoreToLevel();
				break;
			case 2:
				if(this.score - 500 < 0) {
					System.out.println("Level mínimo atingido!");
					this.level = 1;
					this.score = 0;
					break;
				}
				this.score -= 500;
				scoreToLevel();
				break;
			case 3:
				if(this.score - 1000 < 0) {
					System.out.println("Level mínimo atingido!");
					this.level = 1;
					this.score = 0;
					break;
				}
				this.score -= 1000;
				scoreToLevel();
				break;
			case 4:
				if(this.score - 5000 < 0) {
					System.out.println("Level mínimo atingido!");
					this.level = 1;
					this.score = 0;
					break;
				}
				this.score -= 5000;
				scoreToLevel();
				break;
			case 5:
				break;
			default:
				break;
			}
		} while(menuOption != 0);
	}
	
	public void levelUp() {
		
		do {
			System.out.println("---------------------------------------------------------------------");
			setRank();
			showInfo();
			System.out.println("------------------");
			System.out.println("[1] Aumentar 1 Level");
			System.out.println("[2] Aumentar 5 Level");
			System.out.println("[3] Aumentar 10 Level");
			System.out.println("[4] Aumentar 50 Level");
			System.out.println("[5] Voltar");
			System.out.println("------------------");
			System.out.print("Input: ");
			menuOption = input.nextInt();
			
			switch(menuOption) {
			case 1:
				this.level += 1;
				levelToScore();
				break;
			case 2:
				this.level += 5;
				levelToScore();
				break;
			case 3:
				this.level += 10;
				levelToScore();
				break;
			case 4:
				this.level += 50;
				levelToScore();
				break;
			case 5:
				break;
			default:
				break;
			}
			
		} while(menuOption != 0);
	}
	
	public void levelDown() {
		do {
			System.out.println("---------------------------------------------------------------------");
			setRank();
			showInfo();
			System.out.println("------------------");
			System.out.println("[1] Diminuir 1 Level");
			System.out.println("[2] Diminuir 5 Level");
			System.out.println("[3] Diminuir 10 Level");
			System.out.println("[4] Diminuir 50 Level");
			System.out.println("[5] Voltar");
			System.out.println("------------------");
			System.out.print("Input: ");
			menuOption = input.nextInt();
			
			switch(menuOption) {
			case 1:
				if(this.level - 1 <= 0) {
					System.out.println("Level mínimo atingido!");
					this.level = 1;
					this.score = 0;
					break;
				}
				this.level -= 1;
				levelToScore();
				break;
			case 2:
				if(this.level - 5 <= 0) {
					System.out.println("Level mínimo atingido!");
					this.level = 1;
					this.score = 0;
					break;
				}
				this.level -= 5;
				levelToScore();
				break;
			case 3:
				if(this.level - 10 <= 0) {
					System.out.println("Level mínimo atingido!");
					this.level = 1;
					this.score = 0;
					break;
				}
				this.level -= 10;
				levelToScore();
				break;
			case 4:
				if(this.level - 50 <= 0) {
					System.out.println("Level mínimo atingido!");
					this.level = 1;
					this.score = 0;
					break;
				}
				this.level -= 50;
				levelToScore();
				break;
			case 5:
				break;
			default:
				break;
			}
			
		} while(menuOption != 0);
	}
	
	private void setRank() {
		if(level >= 1 && level <= 10) {
			this.rank = "Bronze";
		}
		else if(level > 10 && level <= 25) {
			this.rank = "Prata";
		}
		else if(level > 25 && level <= 50) {
			this.rank = "Ouro";
		}
		else if(level > 50 && level <= 100) {
			this.rank = "Diamante";
		}
		else if(level > 100 && level <= 200) {
			this.rank = "Platina";
		}
		else {
			this.rank = "Elite";
		}
	}
	
	
}
=======
package profiles;

import java.util.Scanner;

public class Player {
	
	Scanner input = new Scanner(System.in);

	private String username;
	private int score;
	private int level;
	private String rank;
	
	public String getUsername() { return username; }
	public int getScore() { return score; }
	public int getLevel() { return level; }
	public String getRank() { return rank; }
	
	private int menuOption = -1;
	
	Player(String username){
		this.username = "@" + username.trim().toLowerCase();
		this.score = 0;
		this.level = 1;
		this.rank = "Bronze";
	}
	
	public void showInfo() {
		System.out.println("Novo Score: " + score);
		System.out.println("Novo Level: " + level);
		System.out.println("Rank: " + rank);
	}
	
	private void scoreToLevel() {
		this.level = this.score / 100;
	}
	
	private void levelToScore() {
		this.score = this.level * 100;
	}
	
	public void scoreUp() {
		do {
			System.out.println("---------------------------------------------------------------------");
			setRank();
			showInfo();
			System.out.println("------------------");
			System.out.println("[1] Aumentar +100");
			System.out.println("[2] Aumentar +500");
			System.out.println("[3] Aumentar +1000");
			System.out.println("[4] Aumentar +5000");
			System.out.println("[5] Voltar");
			System.out.println("------------------");
			System.out.print("Input: ");
			menuOption = input.nextInt();
			
			switch(menuOption) {
			case 1:
				this.score += 100;
				scoreToLevel();
				break;
			case 2:
				this.score += 500;
				scoreToLevel();
				break;
			case 3:
				this.score += 1000;
				scoreToLevel();
				break;
			case 4:
				this.score += 5000;
				scoreToLevel();
				break;
			case 5:
				break;
			default:
				break;
			}
			
		} while(menuOption != 0);
	}
	
	public void scoreDown() {
		do {
			System.out.println("---------------------------------------------------------------------");
			setRank();
			showInfo();
			System.out.println("------------------");
			System.out.println("[1] Diminuir -100");
			System.out.println("[2] Diminuir -500");
			System.out.println("[3] Diminuir -1000");
			System.out.println("[4] Diminuir -5000");
			System.out.println("[5] Voltar");
			System.out.println("------------------");
			System.out.print("Input: ");
			menuOption = input.nextInt();
			
			switch(menuOption) {
			case 1:
				if(this.score - 100 < 0) {
					System.out.println("Level mínimo atingido!");
					this.level = 1;
					this.score = 0;
					break;
				}
				this.score -= 100;
				scoreToLevel();
				break;
			case 2:
				if(this.score - 500 < 0) {
					System.out.println("Level mínimo atingido!");
					this.level = 1;
					this.score = 0;
					break;
				}
				this.score -= 500;
				scoreToLevel();
				break;
			case 3:
				if(this.score - 1000 < 0) {
					System.out.println("Level mínimo atingido!");
					this.level = 1;
					this.score = 0;
					break;
				}
				this.score -= 1000;
				scoreToLevel();
				break;
			case 4:
				if(this.score - 5000 < 0) {
					System.out.println("Level mínimo atingido!");
					this.level = 1;
					this.score = 0;
					break;
				}
				this.score -= 5000;
				scoreToLevel();
				break;
			case 5:
				break;
			default:
				break;
			}
		} while(menuOption != 0);
	}
	
	public void levelUp() {
		
		do {
			System.out.println("---------------------------------------------------------------------");
			setRank();
			showInfo();
			System.out.println("------------------");
			System.out.println("[1] Aumentar 1 Level");
			System.out.println("[2] Aumentar 5 Level");
			System.out.println("[3] Aumentar 10 Level");
			System.out.println("[4] Aumentar 50 Level");
			System.out.println("[5] Voltar");
			System.out.println("------------------");
			System.out.print("Input: ");
			menuOption = input.nextInt();
			
			switch(menuOption) {
			case 1:
				this.level += 1;
				levelToScore();
				break;
			case 2:
				this.level += 5;
				levelToScore();
				break;
			case 3:
				this.level += 10;
				levelToScore();
				break;
			case 4:
				this.level += 50;
				levelToScore();
				break;
			case 5:
				break;
			default:
				break;
			}
			
		} while(menuOption != 0);
	}
	
	public void levelDown() {
		do {
			System.out.println("---------------------------------------------------------------------");
			setRank();
			showInfo();
			System.out.println("------------------");
			System.out.println("[1] Diminuir 1 Level");
			System.out.println("[2] Diminuir 5 Level");
			System.out.println("[3] Diminuir 10 Level");
			System.out.println("[4] Diminuir 50 Level");
			System.out.println("[5] Voltar");
			System.out.println("------------------");
			System.out.print("Input: ");
			menuOption = input.nextInt();
			
			switch(menuOption) {
			case 1:
				if(this.level - 1 <= 0) {
					System.out.println("Level mínimo atingido!");
					this.level = 1;
					this.score = 0;
					break;
				}
				this.level -= 1;
				levelToScore();
				break;
			case 2:
				if(this.level - 5 <= 0) {
					System.out.println("Level mínimo atingido!");
					this.level = 1;
					this.score = 0;
					break;
				}
				this.level -= 5;
				levelToScore();
				break;
			case 3:
				if(this.level - 10 <= 0) {
					System.out.println("Level mínimo atingido!");
					this.level = 1;
					this.score = 0;
					break;
				}
				this.level -= 10;
				levelToScore();
				break;
			case 4:
				if(this.level - 50 <= 0) {
					System.out.println("Level mínimo atingido!");
					this.level = 1;
					this.score = 0;
					break;
				}
				this.level -= 50;
				levelToScore();
				break;
			case 5:
				break;
			default:
				break;
			}
			
		} while(menuOption != 0);
	}
	
	private void setRank() {
		if(level >= 1 && level <= 10) {
			this.rank = "Bronze";
		}
		else if(level > 10 && level <= 25) {
			this.rank = "Prata";
		}
		else if(level > 25 && level <= 50) {
			this.rank = "Ouro";
		}
		else if(level > 50 && level <= 100) {
			this.rank = "Diamante";
		}
		else if(level > 100 && level <= 200) {
			this.rank = "Platina";
		}
		else {
			this.rank = "Elite";
		}
	}
	
	
}
>>>>>>> 9ddf1804665718c759acde12b88d80fc117862f6
