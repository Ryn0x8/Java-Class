class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}
    
class Dog extends Animal {
    private String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void makeSound() {
        System.out.println("The dog barks");
    }
}
    
class Cat extends Animal {
    private boolean isIndoor;
    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }
    
    public boolean getIsIndoor() {
        return isIndoor;
    }
    
    public void makeSound() {
        System.out.println("The cat meows");
    }
    
}


public class Inherit1{
    public static void main(String[] args) {
        Animal animal = new Animal("Tommy", 10);
        Dog dog = new Dog("BullY", 10, "BullDog");
        Cat cat = new Cat("Kitty", 2, true);

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();

        System.out.println("Animal Name: "+ animal.getName());
        System.out.println("Dog Name: "+ cat.getName());
        System.out.println("Cat Name: "+ dog.getName());

        System.out.println("Animal Age: "+ animal.getAge());
        System.out.println("Dog Age: "+ cat.getAge());
        System.out.println("Cat Age: "+ dog.getAge());

        System.out.println("Dog Breed: "+ dog.getBreed());
        if (cat.getIsIndoor()){
            System.out.println("Cat indoor: The cat is in indoor");
        }else{
            System.out.println("Cat indoor: The cat is not indoor");
        }

    }
}

/* 
* Inheritance: Inheritance means creating a new class extending a existing class. Inheritance helps us to override the existing methods in a class. It even gives us access of public properties and methods from the parent class to the child class.
* Advantage: It increases the reuseablity in the code and also optimizes it.  
 */
    
    