package array;

public class ArrayPattern {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 6, 234, 66, 3, 123, 5};
        System.out.println("1. Find the largest element in an array");
        System.out.println(maxInArray(arr));

        System.out.println("2. Find the second largest element in an array");
        System.out.println(secondLargest(arr));
    }

    // 1. Find the largest element in an array
    public static int maxInArray(int[] arr) {

        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int ans = 0;
        for (int j : arr) {
            if (j > ans) {
                ans = j;
            }
        }
        return ans;
    }

    // 2. Find the second-largest element in an array
    public static int secondLargest(int[] arr) {

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second largest element");
        }

        return secondLargest;
    }
}
