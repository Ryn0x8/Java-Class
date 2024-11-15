class SuperClass{
    int number = 56;    
}

class Subclass extends SuperClass{
    int number = 90;
    void printnumber(){
        System.out.println("The number is "+number);
        System.out.println(super.number);
    }

}

class SuperAc{
    public static void main(String[] args){
        Subclass num = new Subclass();
        num.printnumber();
    }
    
}