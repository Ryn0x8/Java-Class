import java.util.*;

public class ArrayListTrial{
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)){
            System.out.print("Enter the no of arrays you want to input: ");
            int noa = keyboard.nextInt();
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            for (int i = 0; i<noa; i++){
                System.out.print("Enter the size for the array "+ (i+1)+ ":");
                int n1 = keyboard.nextInt();
                ArrayList<Integer> l1 = new ArrayList<>();
                System.out.println("Enter the "+ n1+" elements for your "+(i+1)+" Array: ");
                for (int j = 0; j< n1; j++){
                    l1.add(keyboard.nextInt());
                }
                list.add(l1);
            }

            System.out.print("Enter the no of queries to process: ");
            int noq = keyboard.nextInt();
            for (int i =0; i< noq; i++){
                System.out.print("Enter the row and column for query "+ (i+1)+": ");
                int r = keyboard.nextInt();
                int c = keyboard.nextInt();
                try{
                    System.out.println("Element at ("+r+ ", "+c+"): "+ list.get(r-1).get(c-1));
                }catch (Exception e){
                    System.out.print("Error!!!");
                }
            }

        }
    }
}