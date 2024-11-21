// Base class
class ParentClass {
    // Overloaded method: same method name with different parameter lists
    public void display() {
        System.out.println("Display method in ParentClass with no parameters.");
    }

    public void display(String message) {
        System.out.println("Display method in ParentClass with a message: " + message);
    }

    // Method to be overridden in the child class
    public void greet() {
        System.out.println("Hello from ParentClass!");
    }
}

// Child class that inherits from ParentClass
class ChildClass extends ParentClass {
    // Overriding the greet method from the ParentClass
    @Override
    public void greet() {
        System.out.println("Hello from ChildClass!");
    }

    // Overloaded method in the child class
    public void display(int number) {
        System.out.println("Display method in ChildClass with a number: " + number);
    }
}

public class Learning {
    public static void main(String[] args) {
        // Creating an instance of ParentClass
        ParentClass parent = new ParentClass();
        parent.display(); // Calls the no-parameter display method
        parent.display("Welcome!"); // Calls the display method with a String parameter
        parent.greet(); // Calls the greet method from ParentClass

        System.out.println("---------------------------");

        // Creating an instance of ChildClass
        ChildClass child = new ChildClass();
        child.display(); // Inherits and calls the no-parameter display method from ParentClass
        child.display("Hello from child!"); // Inherits and calls the display method with a String parameter
        child.display(42); // Calls the overloaded display method with an integer parameter in ChildClass
        child.greet(); // Calls the overridden greet method from ChildClass
    }
}
