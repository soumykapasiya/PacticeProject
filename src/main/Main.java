package main;

public class Main {
    public static void main(String[] args) {
        // System.out.println(fbSeries(6));
        printSeries(5);
    }

    public static long fbSeries(int num) {
        if (num <= 1)
            return num;
        System.out.println((num - 1) + (num - 2));
        return fbSeries(num - 1) + (num - 2);
    }

    public static void printSeries(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}