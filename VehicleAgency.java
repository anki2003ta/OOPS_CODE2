
import java.util.Scanner;
 
// Define the Engine interface with engine-related methods
interface Engine
{
	String agencyName="TATA Motors LTD";//By Default public ,static and final
	void startEngine();//By Default public and abstract
	void stopEngine();
}
 
// Define an abstract class Vehicle
abstract class Vehicle
{
	String model;
	int year;
	String price;
 
	// Default constructor
	public Vehicle()
	{
    	this.model = "Unknown";
    	this.year = 0;
    	this.price = "0.0";
	}
 
	// Parameterized constructor
	public Vehicle(String model, int year, String price)
	{
    	this.model = model;
    	this.year = year;
    	this.price = price;
	}
 
	// Abstract method for taking input from the user
	abstract void takeInput();
 
	// Abstract method to display vehicle details
	abstract void getDetails();
}
 
// Define a class Car that extends Vehicle and implements Engine
class Car extends Vehicle implements Engine
{
	private String fuelType;
 
	// Default constructor
	public Car()
	{
    	super();
    	this.fuelType = "Unknown";
	}
 
	// Parameterized constructor
	public Car(String model, int year, String price, String fuelType)
	{
    	super(model, year, price);
    	this.fuelType = fuelType;
	}
 
	// Implement the takeInput method to get Car details from the user
	public void takeInput()
	{
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter Car Model: ");
    	model = scanner.nextLine();
    	System.out.print("Enter Manufacturing Year: ");
    	year = scanner.nextInt();
    	scanner.nextLine(); // consume the newline
    	System.out.print("Enter Price: ");
    	//price = scanner.nextDouble();
    	price = scanner.nextLine();
    	System.out.print("Enter Fuel Type: ");
    	fuelType = scanner.nextLine();
	}
 
	// Implement the startEngine method for Car
	public void startEngine()
	{
    	System.out.println("Car engine started.");
	}
 
	// Implement the stopEngine method for Car
	public void stopEngine()
	{
    	System.out.println("Car engine stopped.");
	}
 
	// Implement the getDetails method to display Car details
	public void getDetails()
	{
    	System.out.println("Car Model: " + model);
    	System.out.println("Agency Name: " + agencyName);
    	System.out.println("Year: " + year);
    	System.out.println("Price: Rs " + price);
    	System.out.println("Fuel Type: " + fuelType);
	}
}
 
// Define a class Bike that extends Vehicle and implements Engine
class Bike extends Vehicle implements Engine
{
	private boolean hasCarrier;
 
	// Default constructor
	public Bike()
	{
    	super();
    	this.hasCarrier = false;
	}
 
	// Parameterized constructor
	public Bike(String model, int year, String price, boolean hasCarrier)
	{
    	super(model, year, price);
    	this.hasCarrier = hasCarrier;
	}
 
	// Implement the takeInput method to get Bike details from the user
	public void takeInput()
	{
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter Bike Model: ");
    	model = scanner.nextLine();
    	System.out.print("Enter Manufacturing Year: ");
    	year = scanner.nextInt();
    	scanner.nextLine(); // consume the newline
    	System.out.print("Enter Price: ");
    	//price = scanner.nextDouble();
    	price = scanner.nextLine();
    	System.out.print("Does it have a carrier? (true/false): ");
    	hasCarrier = scanner.nextBoolean();
	}
 
	// Implement the startEngine method for Bike
	public void startEngine()
	{
    	System.out.println("Bike engine started.");
	}
 
	// Implement the stopEngine method for Bike
	public void stopEngine()
	{
    	System.out.println("Bike engine stopped.");
	}
 
	// Implement the getDetails method to display Bike details
	public void getDetails()
	{
    	System.out.println("Bike Model: " + model);
    	System.out.println("Agency Name: " + agencyName);
    	System.out.println("Year: " + year);
    	System.out.println("Price: Rs " + price);
    	System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
	}
}
 
// Define the main class to test the Vehicle Agency
public class VehicleAgency
{
	public static void main(String[] args)
	{
    	Scanner scanner = new Scanner(System.in);
 
    	// Choose between Car and Bike
    	
    	while (true)
    	{
        	System.out.print("\nEnter type of vehicle (Car/Bike) or 'exit' to quit: ");
        	String vehicleType = scanner.nextLine();
 
        	if (vehicleType.equalsIgnoreCase("exit"))
        	{
                System.out.println("Exiting program. Goodbye!");
            	break;
        	}
        	if (vehicleType.equalsIgnoreCase("Car"))
        	{
            	Car c = new Car();
            	c.takeInput();
            	//Start engine, display details, and stop engine
            	System.out.println("\n---- Vehicle Details ----");
            	c.startEngine();
            	c.getDetails();
            	c.stopEngine();
        	}
        	else if (vehicleType.equalsIgnoreCase("Bike"))
        	{
            	Bike b = new Bike();
            	b.takeInput();
            	//Start engine, display details, and stop engine
            	System.out.println("\n---- Vehicle Details ----");
            	b.startEngine();
            	b.getDetails();
            	b.stopEngine();
        	}
        	else
        	{
                System.out.println("Invalid input. Please enter 'Car', 'Bike', or 'exit'.");
            	continue;
        	}   
    	}
	}
}
/*OUTPUT:
 
Enter type of vehicle (Car/Bike) or 'exit' to quit: Car
Enter Car Model: Range Rover
Enter Manufacturing Year: 1970
Enter Price: 2.72 Crore
Enter Fuel Type: Diesel
 
---- Vehicle Details ----
Car engine started.
Car Model: Range Rover
Agency Name: TATA Motors LTD
Year: 1970
Price: Rs 2.72 Crore
Fuel Type: Diesel
Car engine stopped.
 
Enter type of vehicle (Car/Bike) or 'exit' to quit: Bike
Enter Bike Model: Tork T6X
Enter Manufacturing Year: 2017
Enter Price: 1.27 Lakh
Does it have a carrier? (true/false): true
 
---- Vehicle Details ----
Bike engine started.
Bike Model: Tork T6X
Agency Name: TATA Motors LTD
Year: 2017
Price: Rs 1.27 Lakh
Has Carrier: Yes
Bike engine stopped.
 
Enter type of vehicle (Car/Bike) or 'exit' to quit: Scooter
Invalid input. Please enter 'Car', 'Bike', or 'exit'.
 
Enter type of vehicle (Car/Bike) or 'exit' to quit: exit
Exiting program. Goodbye!
 
-----*/


