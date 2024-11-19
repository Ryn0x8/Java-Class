class Parent{
    int age;
    String name;
    void naming(String name){
        System.out.println("Name is "+ name);
    }
}

class Child extends Parent{
    void ageN(int age){
        System.out.println("Age is "+ age);
    }
}


public class Student {
    public static void main(String[] args){
        Child s = new Child();
        s.naming("Coding");
        s.ageN(14);
    }
    
}
