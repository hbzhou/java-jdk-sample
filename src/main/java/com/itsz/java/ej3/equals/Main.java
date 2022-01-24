package com.itsz.java.ej3.equals;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1,2, Color.RED);


        System.out.println(point.equals(cp));
        System.out.println(cp.equals(point));

    }
}
