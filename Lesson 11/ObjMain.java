abstract class Objects{
    abstract void showshape();
    void shape(){
        System.out.println("Object Method");
    }

}

class Circle extends Objects{

    @Override
    void showshape(){
        System.out.println("Circle Shape");
    }

}

class Rectangle extends Objects{
    @Override
    void showshape(){
        System.out.println("Rectangle Shape");
    }
}

class Prism extends Objects{

    @Override
    void showshape(){
        System.out.println("Prism Shape");
    }

}

class Oval extends Objects{
    @Override
    void showshape(){
        System.out.println("Oval Shape");
    }
}

public class ObjMain {

    public static void main(String[] args){
    
        Objects obj1 = new Circle();
        obj1.shape(); 
        obj1.showshape();        
        Objects obj2 = new Rectangle();
        obj2.showshape();
        Objects obj3 = new Prism();
        obj3.showshape();
        Objects obj4 = new Oval();
        obj4.showshape();
        
    
    }
    
}
