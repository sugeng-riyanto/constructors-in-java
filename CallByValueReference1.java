class MyClass {
    int value;

    MyClass(int value) {
        this.value = value;
    }
}

public class CallByValueReference1 {
    public static void main(String[] args) {
        int x = 10;
        modifyPrimitive(x);
        System.out.println("Primitive Value: " + x); // Output: Primitive Value: 10

        MyClass obj = new MyClass(20);
        modifyObject(obj);
        System.out.println("Object Value: " + obj.value); // Output: Object Value: 30
    }

    // Method to modify a primitive type (call by value)
    public static void modifyPrimitive(int a) {
        a = 20;
    }

    // Method to modify an object (call by reference)
    public static void modifyObject(MyClass obj) {
        obj.value = 30;
    }
}
