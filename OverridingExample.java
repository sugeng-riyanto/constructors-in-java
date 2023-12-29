class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.makeSound(); // Output: Some generic sound
        dog.makeSound(); // Output: Woof woof!
    }
}
