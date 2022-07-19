import java.util.Scanner;

public class MyCalWithMethod {

    public static void main(String[] args) {
        int num1;
        int num2;
        String op;
        int result;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        num1 = in.nextInt();

        System.out.print("Enter Second Number: ");
        num2 = in.nextInt();

        System.out.print("Enter Operator: ");
        op = in.next();

        if (op.equalsIgnoreCase("+")) {
            result = sum(num1, num2);
        } else if (op.equalsIgnoreCase("-")) {
            result = minus(num1, num2);
        } else if (op.equalsIgnoreCase("*")) {
            result = multiply(num1, num2);
        } else {
            result = divide(num1, num2);
        }
        System.out.println("The result is: " + result);
    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static int minus(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int divide(int num1, int num2){
        return num1 / num2;
    }
}
