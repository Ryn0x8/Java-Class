import java.util.*;

abstract class Library{
    private final int ID;
    private final String title;
    private final String PublicationDate;
    private final int checkoutDuration;

    public Library(int ID, String title, String publication, int checkOutDur){
        this.ID = ID;
        this.title = title;
        this.PublicationDate = publication;
        this.checkoutDuration = checkOutDur;
    }

    public int getId(){
        return this.ID;
    }

    public String getPublicationDate(){
        return this.PublicationDate;
    }

    public String getTitle(){
        return this.title;
    }

    public int getCheckoutDuration(){
        return this.checkoutDuration;
    }


}

class Book extends Library{
    private final int noPgs;
    private final String author;

    public Book(int ID, String title, String publication, int checkOutDur, int noPages, String author){
        super(ID, title, publication, checkOutDur);
        this.noPgs = noPages;
        this.author = author;
    }

    public int getNoPages(){
        return this.noPgs;
    }

    public String getAuthor(){
        return this.author;
    }
}

class DVD extends Library{
    private final String director;
    private final int runningTime;

    public DVD(int ID, String PublicationDate, String title, String Director, int runningTme, int checkoutDuration){
        super(ID, title, PublicationDate, checkoutDuration);
        this.director = Director;
        this.runningTime = runningTme;
    }

    public int getRunningTime(){
        return this.runningTime;
    }

    public String getDirector(){
        return this.director;
    }
}

class CD extends Library{
    private final int noSongs;
    private final String artist;
    public CD(int ID, String PublicationDate, String title, int checkoutDuration, String artist, int noOfSongs){
        super(ID, title, PublicationDate, checkoutDuration);
        this.artist = artist;
        this.noSongs = noOfSongs;
    }

    public int noOfSongs(){
        return this.noSongs;
    }
    public String getartist(){
        return this.artist;
    }
}

class Patron {
    private final String name;
    private final String id;
    private final List<Library> checkedoutItems;
    private final int MAX_ITEMS = 10;
    
        public Patron(String name, String id){
            this.name = name;
            this.id = id;
            this.checkedoutItems = new ArrayList<>();
        }
    
        public String getName(){
            return this.name;
        }
        public String getId(){
            return this.id;
        }
        public List<Library> getCheckedoutItems(){
            return this.checkedoutItems;
        }
    
        public boolean checkoutItems(Library item){
            if (checkedoutItems.size() <= this.MAX_ITEMS){
            checkedoutItems.add(item);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean returnItem(Library item){
        return checkedoutItems.remove(item);
    }

    public int getNumberOfCheckedoutItems(){
        return this.checkedoutItems.size();
    }
}

public class LibraryMain {
    public static void main(String[] args){
        Book book = new Book(21, "The Great Titanic", "02/31/1201", 14, 2000, "John Buiton");
        DVD dvd = new DVD(30, "03/31/0993", "MickeyMouse", "Keilon Washington", 200, 16);
        CD CD = new CD(30, "03/31/0993", "HeroHeroin", 29, "RamHari Prasad", 16);

        Patron patron = new Patron("Mickey", "P002");

        if (patron.checkoutItems(book)){
            System.out.println("Successfully checked out the book");
        }else{
            System.out.println("You cant checkout any more items");
        }

        if (patron.checkoutItems(dvd)){
            System.out.println("Successfully checked out the dvd");
        }else{
            System.out.println("You cant checkout any more items");
        }

        if (patron.checkoutItems(CD)){
            System.out.println("Successfully checked out the cd");
        }else{
            System.out.println("You cant checkout any more items");
        }

        System.out.println("No of CheckedOut Items: "+ patron.getNumberOfCheckedoutItems());

        if (patron.returnItem(book)){
            System.out.println("Successfully returned the book");
        }

        System.out.println("Updated No of Checked Out Items: "+ patron.getNumberOfCheckedoutItems());

    }
}
