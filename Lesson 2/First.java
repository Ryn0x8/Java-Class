public class First {
    public static void main (String[] args){
        int a = 10;
        int b= 5;
        int sum = a + b;
        int diff = a-b;
        int product = a*b;
        int division = a/b;
        int remainder = a%b;
        System.out.println("=================Method 1=================");
        System.out.println("Sum of a and b: " + sum);
        System.out.println("Difference of a and b: " + diff);
        System.out.println("Product of a and b: " + product);
        System.out.println("Division of a and b: " + division);
        System.out.println("Remainder of a and b: " + remainder);

        System.out.println("=================Method 2=================");
        System.out.println("Sum of a and b: " + (a+b));
        System.out.println("Difference of a and b: " + (a-b));
        System.out.println("Product of a and b: " + (a*b));
        System.out.println("Division of a and b: " + (a/b));
        System.out.println("Remainder of a and b: " + (a%b));


}
}
