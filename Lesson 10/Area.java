class Shape{
    public double getArea(){
        return 0;
    }    
}

class Triangle extends Shape {
    private double base;
    private double height;

    Triangle(double base, double height){
        this.base = base;
        this.height=height;
    }

    public double getArea(){
        return 0.5*base*height;
    }
    
}

class Square extends Shape{
    private double side;
    Square(double side){
        this.side=side;
    }
    public double getArea(){
        return side*side;
    }
}

public class Area {

    public static void main(String[] args){
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(2.67);
        shapes[1] = new Triangle(2.3, 4.5);
        System.out.println("The area of square is "+shapes[0].getArea());
        System.out.println("The area of triangle is "+shapes[1].getArea());
    }
    
}
