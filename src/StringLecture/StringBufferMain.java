package StringLecture;

public class StringBufferMain {

    // StringBuffer is Threadsafe
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This ");
        sb.append("is ").append("my ").append("name");

        System.out.println(sb.toString());

    }
}
