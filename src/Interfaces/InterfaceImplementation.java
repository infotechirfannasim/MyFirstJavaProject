package Interfaces;

import java.util.Scanner;

public class InterfaceImplementation implements MyInterface {

    @Override
    public void sum() {
        int num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        num1 = in.nextInt();

        System.out.print("Enter Second Number: ");
        num2 = in.nextInt();

        System.out.println("The sum is: " + (num1 + num2));
    }

    @Override
    public void sum(int num1, int num2) {
        System.out.println("The sum is: " + (num1 + num2));
    }

    @Override
    public void minus(int num1, int num2) {

    }

}
