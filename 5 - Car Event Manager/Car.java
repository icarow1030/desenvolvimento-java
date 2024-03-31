<<<<<<< HEAD

import java.util.Scanner;

public class Car {
	
	private Scanner inputInfo = new Scanner(System.in);
	
	private String brand;
	private String model;
	private String year;
	private double price;
	
	private boolean engineRunning;
	private int maxSpeed;
	private int currentSpeed;
	
	public String getBrand() { return brand; }
	public String getModel() { return model; }
	public String getYear() { return year; }
	public double getPrice() { return price; }
	
	public int getMaxSpeed() { return maxSpeed; }
	public int getSpeed() { return currentSpeed; }
	
	Car(){
		this.engineRunning = false;
		this.currentSpeed = 0;
	}
	
	public void setInfo() {
		System.out.print("Marca: ");
		this.brand = inputInfo.nextLine();
		
		System.out.print("Modelo: ");
		this.model = inputInfo.nextLine();
		
		do {
			System.out.print("Ano: ");
			this.year = inputInfo.nextLine();
		} while(!validYear(year));
		
		do {
			System.out.print("Preço: ");
			this.price = Double.parseDouble(inputInfo.nextLine());
		} while(price <= 0);
		
		do {
			System.out.print("Velocidade Máxima: ");
			this.maxSpeed = Integer.parseInt(inputInfo.nextLine());
		} while(maxSpeed <= 0);
	}
	
	public void showInfo() {
		System.out.println("Marca: " + this.brand);
		System.out.println("Modelo: " + this.model);
		System.out.println("Ano: " + this.year);
		System.out.printf("Preço: $%.2f\n", this.price);
		System.out.println("Velocidade Máxima: " + this.maxSpeed + "km/h");
	}
	
	public void engine() {
		engineRunning = !engineRunning;
		if(engineRunning) {
			System.out.println("Engine is on!");
		}
		else {
			System.out.println("Engine is off!");
		}
	}
	
	public void throttle() {
		if(engineRunning == false) {
			System.out.println("Engine is off!");
		}
		else {
			this.currentSpeed += 5;
			if(this.currentSpeed > this.maxSpeed) {
				this.currentSpeed = maxSpeed;
			}
		}
	}
	
	public void brake() {
		if(engineRunning == false) {
			System.out.println("Engine is off!");
		}
		else {
			this.currentSpeed -= 5;
			if(this.currentSpeed < 0) {
				this.currentSpeed = 0;
			}
		}
	}
	
	private boolean validYear(String year) {
		try {
	        int yearValue = Integer.parseInt(year);
	        return yearValue >= 1886 && yearValue <= 2024;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	
}
=======

import java.util.Scanner;

public class Car {
	
	private Scanner inputInfo = new Scanner(System.in);
	
	private String brand;
	private String model;
	private String year;
	private double price;
	
	private boolean engineRunning;
	private int maxSpeed;
	private int currentSpeed;
	
	public String getBrand() { return brand; }
	public String getModel() { return model; }
	public String getYear() { return year; }
	public double getPrice() { return price; }
	
	public int getMaxSpeed() { return maxSpeed; }
	public int getSpeed() { return currentSpeed; }
	
	Car(){
		this.engineRunning = false;
		this.currentSpeed = 0;
	}
	
	public void setInfo() {
		System.out.print("Marca: ");
		this.brand = inputInfo.nextLine();
		
		System.out.print("Modelo: ");
		this.model = inputInfo.nextLine();
		
		do {
			System.out.print("Ano: ");
			this.year = inputInfo.nextLine();
		} while(!validYear(year));
		
		do {
			System.out.print("Preço: ");
			this.price = Double.parseDouble(inputInfo.nextLine());
		} while(price <= 0);
		
		do {
			System.out.print("Velocidade Máxima: ");
			this.maxSpeed = Integer.parseInt(inputInfo.nextLine());
		} while(maxSpeed <= 0);
	}
	
	public void showInfo() {
		System.out.println("Marca: " + this.brand);
		System.out.println("Modelo: " + this.model);
		System.out.println("Ano: " + this.year);
		System.out.printf("Preço: $%.2f\n", this.price);
		System.out.println("Velocidade Máxima: " + this.maxSpeed + "km/h");
	}
	
	public void engine() {
		engineRunning = !engineRunning;
		if(engineRunning) {
			System.out.println("Engine is on!");
		}
		else {
			System.out.println("Engine is off!");
		}
	}
	
	public void throttle() {
		if(engineRunning == false) {
			System.out.println("Engine is off!");
		}
		else {
			this.currentSpeed += 5;
			if(this.currentSpeed > this.maxSpeed) {
				this.currentSpeed = maxSpeed;
			}
		}
	}
	
	public void brake() {
		if(engineRunning == false) {
			System.out.println("Engine is off!");
		}
		else {
			this.currentSpeed -= 5;
			if(this.currentSpeed < 0) {
				this.currentSpeed = 0;
			}
		}
	}
	
	private boolean validYear(String year) {
		try {
	        int yearValue = Integer.parseInt(year);
	        return yearValue >= 1886 && yearValue <= 2024;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	
}
>>>>>>> 9ddf1804665718c759acde12b88d80fc117862f6
