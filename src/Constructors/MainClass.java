package Constructors;

public class MainClass {

    public static void main(String[] args) {
        Chair chair = new Chair(4, 1, "Comfortable");
        Chair chair1 = new Chair(10, 1, "Not comfortable");
        Chair chair2 = new Chair(5, 1, "More Comfortable");
        Chair chair3  = new Chair();

        System.out.println(chair);
        System.out.println(chair1);
        System.out.println(chair2);
        System.out.println(chair3);
    }
}
