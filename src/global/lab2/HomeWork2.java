package com.course.se.lesson1;

public class HomeWork2 {
    public static void main(String[] args) {
        double a = 2.98;
        double b = 5.55;
        double c = 0.045;
        double d = 0.129;
        double y;
        y = (Math.pow(a, b)/(Math.cosh(b))) + (4*(Math.log10(c)/(Math.pow(d, 1.0/5.0))));
        System.out.println(y);
    }
}
