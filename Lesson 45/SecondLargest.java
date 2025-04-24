public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] example1 = {5, 3, 9, 1, 9};
        int[] example2 = {7};
        int[] example3 = {4, 4, 4};

        System.out.println(findSecondLargest(example1));
        System.out.println(findSecondLargest(example2)); 
        System.out.println(findSecondLargest(example3));
    }
}
