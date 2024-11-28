class Book{
    private final String name;
    private final double price;

    public Book(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
} 


class TextBook extends Book{
    private final int edition;
    public TextBook(String name, double price, int edition){
        super (name, price);
        if (edition < 0){
            this.edition = 0;
        }else{
            this.edition = edition;
        }
    }

    
    public int getEdition(){
        return edition;
    }

    public String getBookInfo(){
        return "Name: " + getName() + ", Price: " + getPrice() + ", Edition: " + edition;
    }

    public boolean canSubstituteFor(TextBook other){
        return this.getName().equalsIgnoreCase(other.getName()) && this.getEdition() >= other.getEdition();
        }

    }


public class Constructor2{
    public static void main(String[] args){
        TextBook javaBook = new TextBook("Java Programming", 40.0, 6);
        TextBook javaBook2 = new TextBook("Java Programming", 40.0, 5);
        System.out.println(javaBook.getBookInfo());
        System.out.println(javaBook.canSubstituteFor(javaBook2));
        TextBook cBook = new TextBook("C Programming", 35.0, 4);
        System.out.println(cBook.getBookInfo());
}
}
