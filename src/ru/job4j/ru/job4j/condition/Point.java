package ru.job4j.ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;
        double rsl = Math.pow(x, 2) + Math.pow(y, 2);
        rsl = Math.sqrt(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) is " + result);
    }
}
