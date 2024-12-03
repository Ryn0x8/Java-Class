class Circle {
    private final double radius;
    public Circle(double r ){
        radius = r;
    }
    
    public double getRadius(){
        return radius;
    }

    public double getDiameter(){
        return 2*radius;
    }

    public double getArea(){
        return Math.PI *radius*radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
}

public class CircleC {
    public static void main(String[] args){
        Circle c = new Circle(2.4);
        System.out.println("Radius of Circle: "+ c.getRadius());
        System.out.println("Diameter of Circle: "+ c.getDiameter());
        System.out.println("Area of Circle: "+ c.getArea());
        System.out.println("Circumference of Circle: "+ c.getCircumference());


    }
}
