package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class MapMainClass {

    public static void main(String args[]) {
        // map of strings
        Map<String, String> map = new HashMap<>();

        map.put("std1", "irfan");
        map.put("std2", "makki");

        System.out.println(map.get("std1"));


        //-----------
        // map of objects
        Map<String, Student> map1 = new HashMap<>();
        Student std1 = new Student(1, "Irfan");
        Student std2 = new Student(2, "Makki");
        Student std3 = new Student(3, "Nayab");
        Student std4 = new Student(4, "Dasho");


        map1.put("std1", std1);
        map1.put("std2", std2);
        map1.put("std3", std3);
        map1.put("std4", std4);

        System.out.println(map1.get("std1"));

    }
}
