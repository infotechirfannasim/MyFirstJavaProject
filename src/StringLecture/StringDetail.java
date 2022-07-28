package StringLecture;

public class StringDetail {

    public static void main(String[] args) {
        String str = "IRFAN";
        String str1 = "irfan";
        String str2 = "Irfan";
        String str3 = new String("irfan");



        // getting chunk from string
        // from begin index
        // System.out.println(str.substring(1));

        // from start index to end index
        System.out.println(str.substring(2, 4));

        // to concate
       /* System.out.println(str + str1);
        System.out.println(str.concat(str1));*/

        // To all lower case
        //System.out.println(str.toLowerCase());

        // To all upper case
        // System.out.println(str.toUpperCase());

        // single statement not need brackets
       /* if (str.equalsIgnoreCase(str2))  // this is comparing value / content of the object
            System.out.println("String is equal");
        else
            System.out.println("String is not equal");*/

        // ternary operators
        //System.out.println(str.equalsIgnoreCase(str2) ? "String is equal" : "String is not equal");

        /*if (str.equalsIgnoreCase(str2)) { // this is comparing value / content of the object
            System.out.println("String is equal");
        } else {
            System.out.println("String is not equal");
        }*/

        /*if(str == str3){ // this is comparing reference of the object
            System.out.println("String is equal");
        } else {
            System.out.println("String is not equal");
        }*/

    }
}
