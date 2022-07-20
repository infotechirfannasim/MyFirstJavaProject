package Overloading;

public class MyMethodOverloading {

    public static void main(String[] args) {
        System.out.println(sum(10, 2));
        System.out.println(sum(10, 2, 3));
        System.out.println(sum(10, 10.0)); // double type method calling
        System.out.println(sum(10, 10.0f)); // float method calling
        // data types
        // int = 4 bytes
        // float = 4 bytes = 10.2
        // double = 8 bytes = 10.2


    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static float sum(int num1, float num2) {
        return num1 + num2;
    }

    public static double sum(int num1, double num2) {
        return num1 + num2;
    }

}
