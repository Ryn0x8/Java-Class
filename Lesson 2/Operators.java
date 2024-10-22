public class Operators {
    public static void main (String[] args){
        int a = 10;
        int b = 5;
        System.out.println("===Guess the answer===");
        System.out.println("Uninary Operators "+ (a++));
        System.out.println("Uninary Operators "+ (++b));
        System.out.println("Binary Operators");
        System.out.println("1+2"+ 1+2);
        System.out.println("1+2"+ (1+2));
        System.out.println(1+2 +"= 3");
        int increment = ++a * b++;
        System.out.println("Increment: "+ increment);
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("Ternary Operators");
        int max = (a>b) ? a:b;
        System.out.println("Max: "+ max);

    }
}
