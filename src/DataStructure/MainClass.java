package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        Student std1 = new Student(1, "Irfan");
        Student std2 = new Student(2, "Makki");
        Student std3 = new Student(3, "Nayab");
        Student std4 = new Student(4, "Dasho");

        // List
        List<Student> students = new ArrayList<>();
        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std4);

        // For Loop
        /*for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }*/

        // For Each loop
        for (Student std : students) {
            System.out.println(std);
        }

        // Assignments
        // 1- Calculate Prime Number with default value
        // 2- Calculate prime number with user given value
        // 3- write a method of prime number, and call it from main method, pass number and check weather it is prime number or not
    }
}
