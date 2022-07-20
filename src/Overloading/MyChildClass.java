package Overloading;

public class MyChildClass {
    public static void main(String[] args) {
        // Non-static method 'multiply(int, int)' cannot be referenced from a static context
        //System.out.println(MyParentClass.multiply(10, 10));
        // 1 - default constructor
        MyParentClass object = new MyParentClass(); //  creating the object
        System.out.println(object.multiply(10, 10));

        // new MyParentClass() this is called constructor calling
        // Constructors
        // constructor is a special method used to crate an object
        // Type of Constructors
        // 1 - default constructor
        // 2- parametrized constructors
        // 3- copy constructors

        // 2- parametrized constructors


    }
}
