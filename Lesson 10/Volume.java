abstract class Shape {
    public abstract double getVolume();
}

class Cube extends Shape {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }
}

class Cuboid extends Shape {
    private final double length, width, height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }
}

class Cylinder extends Shape {
    private final double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

public class Volume {
    public static void main(String[] args) {
        Cube cube = new Cube(5);
        Cuboid cuboid = new Cuboid(4, 3, 2);
        Cylinder cylinder = new Cylinder(3, 7);

        System.out.println("Volume of the Cube: " + cube.getVolume() + " cm3");
        System.out.println("Volume of the Cuboid: " + cuboid.getVolume() + " cm3");
        System.out.println("Volume of the Cylinder: " + cylinder.getVolume() + " cm3");
    }
}
