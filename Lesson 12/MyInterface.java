interface MyInt{
    public void method1();
    public void method2();
}

public class MyInterface implements MyInt{
    @Override
    public void method1(){
        System.out.println("Method 1 from MyInterface");
    }
    
    @Override
    public void method2(){
        System.out.println("Method 2 from MyInterface");
    }
    
    public static void main(String[] args){
        MyInterface myInt = new MyInterface();
        myInt.method1();
        myInt.method2();
    
    }
}
