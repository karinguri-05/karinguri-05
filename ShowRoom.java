import java.util.Scanner;

// Base class: Vehicle
class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    // Constructor to initialize the fields
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("\nVehicle Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Subclass: Car that inherits from Vehicle
class Car extends Vehicle {
    private String fuelType;

    // Constructor that initializes fields from both Vehicle and Car class
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    // Override displayDetails method to include fuelType
    @Override
    public void displayDetails() {
        super.displayDetails();  // Calling base class method
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Showroom class to take input and display the car details
public class ShowRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter Car Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter Car Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Car Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter Car Fuel Type: ");
        String fuelType = scanner.nextLine();

        // Create an instance of Car
        Car car = new Car(brand, model, year, fuelType);

        // Display the car's details
        car.displayDetails();

        scanner.close();
    }
}
