class Person {
    private String name;
    private int age;

    // Default Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorExample1 {
    public static void main(String[] args) {
        Person person1 = new Person(); // Using default constructor
        Person person2 = new Person("Alice", 25); // Using parameterized constructor

        person1.displayInfo(); // Output: Name: Unknown, Age: 0
        person2.displayInfo(); // Output: Name: Alice, Age: 25
    }
}
