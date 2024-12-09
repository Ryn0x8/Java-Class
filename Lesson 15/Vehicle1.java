abstract class Vehicle { 
    private final String make; 
    private final String model; 
    private final int year; 
    public Vehicle(String make, String model, int year) { 
        this.make = make; 
        this.model = model; 
        this.year = year; 
    } 
    public abstract void drive(); 
    public String getMake() { return make; } 
    public String getModel() { return model; } 
    public int getYear() { return year; } 
} 
class Car extends Vehicle { 
    private final int numDoors; 
    public Car(String make, String model, int year, int numDoors) { 
        super(make, model, year); 
        this.numDoors = numDoors; 
    } 
    @Override
    public void drive() { 
        System.out.println("Driving car..."); 
    } 
    public int getNumDoors() { return numDoors; } 
} 
class Truck extends Vehicle { 
    private final int payloadCapacity; 
    public Truck(String make, String model, int year, int payloadCapacity) { 
        super(make, model, year); this.payloadCapacity = payloadCapacity; 
    } 

    @Override
    public void drive() { System.out.println("Driving truck..."); } 
    public int getPayloadCapacity() { return payloadCapacity; } 
}

public class Vehicle1{
    public static void main(String[] args){
        Vehicle myCar = new Car("Tata", "Tata Nano", 2000, 7); 
        Vehicle myTruck = new Truck("Road King", "Road King-Model", 1996, 1000);


        // * Here there is a use of Polymorphism
        myCar.drive(); // * This
        myTruck.drive(); // * This

        System.out.println("Car Make: " + myCar.getMake());
        System.out.println("Truck Make: " + myTruck.getMake());

        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Truck Model: " + myTruck.getModel());

        System.out.println("Car Year: " + myCar.getYear());
        System.out.println("Truck Year: " + myTruck.getYear());

    }
}

/*
 * Abstract Class Advantages:
 * We can write shorter codes and also avoids duplication. 
 * We can also create common behaviour and methods / properties.
 * Vehicle class cannot be instantiated directly but through its child classes.
 */

