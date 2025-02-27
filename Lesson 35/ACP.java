import java.util.*;

class Apple{
    public int x;
    public int y;
    
    public Apple(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class ACP {
    static int partition(List<Apple> arr, int low, int high){
        Apple pivot = arr.get(high);

        int i = (low-1);

        for (int j = low; j<=high-1; j++){
            if (arr.get(j).x <= pivot.x && arr.get(j).y <= pivot.y){
                i++;
                Collections.swap(arr, i, j);
            }
        }
        Collections.swap(arr, i+1, high);
        return (i+1);
    }

    static void quickSort(List<Apple> arr, int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    static void travelandCountApples(List<Apple> arr){
        quickSort(arr, 0, arr.size()-1);

        int applesEaten = 0;
        int currentX = 1, currentY = 1;
        for (Apple apple: arr){
            if (apple.x >= currentX && apple.y >= currentY){
                applesEaten++;
                System.out.println("Apple at ("+apple.x+", "+apple.y+") is eaten.");
                System.out.println("Apples eaten so far: "+applesEaten);
                currentX = apple.x;
                currentY = apple.y;
            }
        }
    }

    public static void main(String[] args){
        List<Apple> arr = new ArrayList<>();
        arr.add(new Apple(1, 2));
        arr.add(new Apple(2, 3));
        arr.add(new Apple(2, 1));
        arr.add(new Apple(3, 2));
        arr.add(new Apple(4, 3));
        arr.add(new Apple(3, 4));
        travelandCountApples(arr);
    }
}
