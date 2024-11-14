class Animal{
    public void eat(){
        System.out.println("Eat Method Animal");
    }
}

class Lion extends Animal{
    public void roar(){
        System.out.println("Roar Method Lion");
    }
}

class Babylion extends Lion{
    public void weep(){
        System.out.println("Weep Method BabyLion");
    }
}

public class Anim {
    public static void main(String[] args){
        Babylion obj = new Babylion();
        obj.eat();
        obj.roar();
        obj.weep();
    }
    
}
