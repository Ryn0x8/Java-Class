import java.util.*;

public class WarmUp {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            al.add(i * 2);
        }
        al.remove(3);
        al.remove(6);
        al.remove(4);

        System.out.println("Orginal Current  Array: "+ al.toString());
        System.out.println("Current Array Size: "+ al.size());

    }
}
