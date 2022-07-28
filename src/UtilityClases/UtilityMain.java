package UtilityClases;

import java.util.ArrayList;
import java.util.List;

public class UtilityMain {

    public static void main(String[] args) {

        int i = 5;
        float f = 3.0f;
        double d = 5.0;
        int sum = i + (int)d;

       /* int i = 1;
        Integer in = 1;
        Integer in1 = 1;
      *//*  System.out.println(i);
        System.out.println(in.doubleValue());*//*

        List<Integer> integers = new ArrayList<>();
        integers.add(i);
        integers.add(in);
        integers.add(in1);
        for(Integer inn : integers){
            System.out.println(inn);
        }*/

        // int, float, double, char, boolean, byte, short, long
        // byte, short, int, long == bagair dot wlae
        // byte = 1 byte // Byte
        // short = 2 byte // Short
        // int = 4 byte // Integer
        // long 8 byte // Long

        // float, double // dot wale
        // float = 4 byte // Float
        // double = 8 byte // Double

        // boolean, char
        // boolean = 1 byte // Boolean
        // char = 2 byte  // Char

    }
}
