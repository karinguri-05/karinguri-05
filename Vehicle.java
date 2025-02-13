// Base class Vehicle
class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate(int increase) {
        speed += increase;
    }

    public void brake(int decrease) {
        speed = Math.max(0, speed - decrease);
    }

    public void showDetails() {
        System.out.println("Vehicle details: Brand = " + brand + ", Speed = " + speed);
    }
}

// Subclass Car
class Car extends Vehicle {
    private int fuelLevel;

    public Car(String brand, int speed, int fuelLevel) {
        super(brand, speed);
        this.fuelLevel = fuelLevel;
    }

    public void refuel(int amount) {
        fuelLevel = Math.min(100, fuelLevel + amount);
    }

    @Override
    public void showDetails() {
        System.out.println("Car details: Brand = " + brand + ", Speed = " + speed + ", Fuel Level = " + fuelLevel + "%");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    private boolean helmetOn;

    public Bike(String brand, int speed, boolean helmetOn) {
        super(brand, speed);
        this.helmetOn = helmetOn;
    }

    public void wearHelmet() {
        helmetOn = true;
    }

    @Override
    public void showDetails() {
        System.out.println("Bike details: Brand = " + brand + ", Speed = " + speed + ", Helmet On = " + helmetOn);
    }
}

// Main class
public class VehicleSystem {
    public static void main(String[] args) {
        // Instantiate Car object with given values
        Car car = new Car("Toyota", 60, 50);
        car.accelerate(20); // Increase speed by 20
        car.brake(30); // Decrease speed by 30
        car.refuel(30); // Refuel by 30
        car.showDetails(); // Display details

        // Instantiate Bike object with given values
        Bike bike = new Bike("Yamaha", 40, false);
        bike.accelerate(15); // Increase speed by 15
        bike.brake(10); // Decrease speed by 10
        bike.wearHelmet(); // Wear a helmet
        bike.showDetails(); // Display details
    }
}
