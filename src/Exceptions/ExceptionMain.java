package Exceptions;

public class ExceptionMain {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 0;
        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException exception) {
           exception.printStackTrace();
            System.out.println("Exception occure");
        } finally {
            System.out.println("Finally execute");
        }
    }
}
