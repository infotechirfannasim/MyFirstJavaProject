public class MyMethod {

    public static void main(String[] args) {
        // calling of the method
        int plus = sum(10, 2);
        System.out.println(plus);

    }


    // Methods
    // access modifier - static / non static - return type - name of method - arguments / parameters

    public static int sum(int num1, int num2) { // method signature
        // definition of the method
        int sum = num1 + num2;
        return sum;
    }

}
