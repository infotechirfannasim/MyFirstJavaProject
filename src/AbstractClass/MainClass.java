package AbstractClass;

public class MainClass {
    public static void main(String[] args) {

        // Abstract class can't instantiate
        MyConcreteClass obj = new MyConcreteClass();
        obj.sum();
    }
}
