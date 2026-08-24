class Vehicle {
    public String brand;
    public int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void move() {
        System.out.println("The vehicle is moving.");
    }
}

class Car extends Vehicle {
    public int numDoors;

    public Car(String brand, int speed, int numDoors) {
        super(brand, speed);
        this.numDoors = numDoors;
    }

    @Override
    public void move() {
        System.out.println("The car is driving.");
    }
}

class Bike extends Vehicle {
    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println("The bike is riding.");
    }
}

class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("Toyota", 120, 4),
            new Bike("Trek", 30),
            new Car("Hyundai", 150, 4)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}