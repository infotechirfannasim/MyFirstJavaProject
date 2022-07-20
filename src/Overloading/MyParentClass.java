package Overloading;

public class MyParentClass {

    public static int variable = 10;

    // Default Constructor / No-Args Constructor
    MyParentClass() {

    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
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
