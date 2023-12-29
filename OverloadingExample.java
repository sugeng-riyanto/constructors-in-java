class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of two numbers: " + calc.add(5, 7)); // Output: 12
        System.out.println("Sum of three numbers: " + calc.add(2, 4, 6)); // Output: 12
    }
}
