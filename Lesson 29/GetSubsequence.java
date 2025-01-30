import java.util.*;

public class GetSubsequence{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> path = new ArrayList<>();
        printSubsequence(arr, 0, path);        
    }

    public static void printSubsequence(int[] arr, int idx, ArrayList<Integer> path){
        if (idx == arr.length){
            System.out.println(path);
        }else{
            printSubsequence(arr, idx+1, path);
            path.add(arr[idx]);
            printSubsequence(arr, idx+1, path);
            path.remove(path.size()-1);
        }
    }
}