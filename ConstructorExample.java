class Car {
    private String brand;
    private String model;

    // Default Constructor
    public Car() {
        this.brand = "Undefined";
        this.model = "Unknown";
    }

    // Parameterized Constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Car car1 = new Car(); // Using default constructor
        Car car2 = new Car("Toyota", "Corolla"); // Using parameterized constructor

        car1.displayInfo(); // Output: Brand: Undefined, Model: Unknown
        car2.displayInfo(); // Output: Brand: Toyota, Model: Corolla
    }
}
