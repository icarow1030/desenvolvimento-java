<<<<<<< HEAD

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// Garage
		ArrayList<Car> garage = new ArrayList<>();

		// Variables
		int menuOption = -1;
		int carSelectionOption = -1;
		int carControlOption = -1;
		
		// Menu
		do {
			
			System.out.println("---------------------------------------------------------");
			System.out.println("[1] Adicionar Carro");
			System.out.println("[2] Carros");
			System.out.println("[0] Voltar");
			System.out.println("-----------------------");
			System.out.print("= Input: ");
			menuOption = input.nextInt();
			
			switch(menuOption) {
			
			case 1:
				
				Car newCar = new Car();
				System.out.println("---------------------------------------------------------");
				System.out.println("ADICIONAR CARRO");
				newCar.setInfo();
				System.out.println("---------------------------------------------------------");
				newCar.showInfo();
				garage.add(newCar);
				break;
				
			case 2:
				
				int carIndex = 0;
				
				if(garage.size() == 0) {
					System.out.println("Empty!");
					break;
				}
					
				for(Car car : garage) {
					System.out.println("["+(carIndex+1)+"] " + car.getBrand() +" "+ car.getModel() +" "+ car.getYear());
					carIndex++;
				}
				System.out.println("-----------------------");
				System.out.println("[1] Entrar no Carro");
				System.out.println("[2] Voltar");
				System.out.print("= Input: ");
				carSelectionOption = input.nextInt();
				
				switch(carSelectionOption) {
				
				case 1:
					
					System.out.println("---------------------------------------------------------");
					do {
						System.out.print("== Selecione o Carro: ");
						carSelectionOption = input.nextInt();
					} while(carSelectionOption < 1 || carSelectionOption > garage.size());
					
					carIndex = carSelectionOption - 1;
					
					garage.get(carIndex).showInfo();
					System.out.println("---------------------------------------------------------");
					
					do {
						System.out.println("Velocidade Atual: " + garage.get(carIndex).getSpeed() + "km/h");
						System.out.println("[1] Ignição");
						System.out.println("[2] Acelerar");
						System.out.println("[3] Frear");
						System.out.println("[0] Sair do Carro");
						System.out.print("= Ação: ");
						carControlOption = input.nextInt();
						
						switch(carControlOption) {
						
						case 1:
							garage.get(carIndex).engine();
							break;
						case 2:
							garage.get(carIndex).throttle();
							break;
						case 3:
							garage.get(carIndex).brake();
							break;
						case 0:
							System.out.println("Saiu do carro!");
							break;
						default:
							System.out.println("Opção inválida!");
							break;
						}
					} while(carControlOption != 0);
					
					break;
				
				}

		     	break;
			}
			
		} while(menuOption != 0);
	}

}
=======

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// Garage
		ArrayList<Car> garage = new ArrayList<>();

		// Variables
		int menuOption = -1;
		int carSelectionOption = -1;
		int carControlOption = -1;
		
		// Menu
		do {
			
			System.out.println("---------------------------------------------------------");
			System.out.println("[1] Adicionar Carro");
			System.out.println("[2] Carros");
			System.out.println("[0] Voltar");
			System.out.println("-----------------------");
			System.out.print("= Input: ");
			menuOption = input.nextInt();
			
			switch(menuOption) {
			
			case 1:
				
				Car newCar = new Car();
				System.out.println("---------------------------------------------------------");
				System.out.println("ADICIONAR CARRO");
				newCar.setInfo();
				System.out.println("---------------------------------------------------------");
				newCar.showInfo();
				garage.add(newCar);
				break;
				
			case 2:
				
				int carIndex = 0;
				
				if(garage.size() == 0) {
					System.out.println("Empty!");
					break;
				}
					
				for(Car car : garage) {
					System.out.println("["+(carIndex+1)+"] " + car.getBrand() +" "+ car.getModel() +" "+ car.getYear());
					carIndex++;
				}
				System.out.println("-----------------------");
				System.out.println("[1] Entrar no Carro");
				System.out.println("[2] Voltar");
				System.out.print("= Input: ");
				carSelectionOption = input.nextInt();
				
				switch(carSelectionOption) {
				
				case 1:
					
					System.out.println("---------------------------------------------------------");
					do {
						System.out.print("== Selecione o Carro: ");
						carSelectionOption = input.nextInt();
					} while(carSelectionOption < 1 || carSelectionOption > garage.size());
					
					carIndex = carSelectionOption - 1;
					
					garage.get(carIndex).showInfo();
					System.out.println("---------------------------------------------------------");
					
					do {
						System.out.println("Velocidade Atual: " + garage.get(carIndex).getSpeed() + "km/h");
						System.out.println("[1] Ignição");
						System.out.println("[2] Acelerar");
						System.out.println("[3] Frear");
						System.out.println("[0] Sair do Carro");
						System.out.print("= Ação: ");
						carControlOption = input.nextInt();
						
						switch(carControlOption) {
						
						case 1:
							garage.get(carIndex).engine();
							break;
						case 2:
							garage.get(carIndex).throttle();
							break;
						case 3:
							garage.get(carIndex).brake();
							break;
						case 0:
							System.out.println("Saiu do carro!");
							break;
						default:
							System.out.println("Opção inválida!");
							break;
						}
					} while(carControlOption != 0);
					
					break;
				
				}

		     	break;
			}
			
		} while(menuOption != 0);
	}

}
>>>>>>> 9ddf1804665718c759acde12b88d80fc117862f6
