package StringLecture;

public class StringMain {

    public static void main(String[] args) {
        //String is Immutable
        String imutable = "imutable";
        imutable = "test";
        System.out.println(imutable);

        // String is immutable
        // c++: String character array
        // java: String is object
        /*String str = "Makki";
        String str1 = "Makki";
        String str2 = "Makki";*/

        //System.out.println(str.hashCode());
        // System.out.println(str1.hashCode());
        // System.out.println(str2.hashCode());

        char[] ch = {'m', 'a', 'k', 'k', 'i'};
        //String s = new String(ch);
        //System.out.println(s);
        //System.out.println(s.hashCode());

        String str3 = new String("Makki");
        // System.out.println(str3);
        //System.out.println(str3.hashCode());

    }
}
