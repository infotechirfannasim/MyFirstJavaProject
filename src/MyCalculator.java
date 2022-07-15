import java.util.Scanner;

public class MyCalculator {

    // project for makki
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
            result = num1 + num2;
        } else if (op.equalsIgnoreCase("-")) {
            result = num1 - num2;
        } else if (op.equalsIgnoreCase("*")) {
            result = num1 * num2;
        } else {
            result = num1 / num2;
        }
        System.out.println("The result is: " + result);
    }
}
