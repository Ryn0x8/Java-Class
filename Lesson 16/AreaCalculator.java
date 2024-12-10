interface Shape { 
    double getArea(); 
} 

class Rectangle implements Shape { 
    private final double width; 
    private final double height; 
    public Rectangle(double width, double height) { 
        this.width = width; 
        this.height = height; 
    }

    @Override
    public double getArea() { 
        return width * height; 
    } 
} 
class Circle implements Shape {
    private final double radius; 
    public Circle(double radius) { 
        this.radius = radius; 
    } 
    @Override
    public double getArea() { 
        return Math.PI * radius * radius; 
    } 
} 
public class AreaCalculator { 
    double sumAreas(Shape[] shapes) { 
        double totalArea = 0; 
        for (Shape shape : shapes) { 
            totalArea += shape.getArea(); 
        } 
        return totalArea; 
    } 

    public static void main(String[] args){
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(20, 30);
        shapes[1] = new Circle(15);

        AreaCalculator ac = new AreaCalculator();
        System.out.println("Sum of all the shapes: " + ac.sumAreas(shapes));
        
    }
}

/*
 * Polymorphism is a concept of OOP (Object Orientated Programming) that allows the user to handle different objects using a common interface or a common parent class.
 */