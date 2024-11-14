class Mammals {
    void mam(){
        System.out.println("Inside Mammal Class");
    }  
}

class Lions extends Mammals{
    void roar(){
        System.out.println("Inside Lion Class");
    }  
}

class Human extends Mammals{
    void hum(){
        System.out.println("Inside Human Class");
    }  
}

public class Mmals {

    public static void main(String[] args){
        Human obj = new Human();
        obj.mam();
        obj.hum();
        
    }
    
}
