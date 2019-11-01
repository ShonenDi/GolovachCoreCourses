package com.gmail.shonen1988;

public class FirstLesson {
    public static void main(String[] args) {
        String s = "Hello";
//        String s1 = new String(new char[]{'H','e','l','l','o'},0,5);
        System.out.println(s);
//        System.out.println(s1);
        String s2 = s.substring(1, 4);
        System.out.println(s2);
    }
}
