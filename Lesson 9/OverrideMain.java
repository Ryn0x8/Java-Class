class Parent{
    public void sayHello(){
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent{
    @Override
    public void sayHello(){
        System.out.println("Hello from Child");
    }
}

class OverrideMain {
    public static void main(String[] args){
        Parent child = new Child();
        child.sayHello();
    }
}
