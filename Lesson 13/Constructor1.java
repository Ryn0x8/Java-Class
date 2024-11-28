class Person{
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() { return name; }
    public int getAge(){ return age;}
}

class Student extends Person { 
    private final String major; 
    public Student(String name, int age, String major) { 
        super(name, age);
        this.major = major; 
    }
    public String getMajor() { return major; } 
}

public class Constructor1 {

    public static void main(String[] args) {
    
        Student student1 = new Student("John Doe", 21, "Computer Science");
        System.out.println("Name: " + student1.getName());
        System.out.println("Major: " + student1.getMajor());
        System.out.println("Age: " + student1.getAge());

        Student student2 = new Student("Jane Smith", 19, "Mathematics");
        System.out.println("Name: " + student2.getName());
        System.out.println("Major: " + student2.getMajor());
        System.out.println("Age: " + student2.getAge());    
    }
    
}
