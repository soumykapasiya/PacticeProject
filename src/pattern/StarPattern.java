package pattern;

public class StarPattern {
    public static void main(String[] args) {

        System.out.print("Right Triangle Star Pattern");
        rightTrianglePattern(5);

        System.out.println("\nInverted Right Triangle Star Pattern");
        invertedRightTriangle(5);

        System.out.println("\nEquilateral Triangle Star Pattern");
        equilateralTriangle(5);

        System.out.println("\nInverted Right Triangle Star Pattern");
        reversePyramidPattern(5);

        System.out.println("\ndiomand Pattern");
        diamondPattern(5);

        System.out.println("\ndifferent Pattern ");
        differentPattern(5);

    }

    public static void rightTrianglePattern(int num) {
        for (int i = num; i >= 0; i--) {
            for (int j = i; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedRightTriangle(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void equilateralTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reversePyramidPattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (num - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamondPattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (num - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void differentPattern(int num) {
        for (int i = 1; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (num - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
