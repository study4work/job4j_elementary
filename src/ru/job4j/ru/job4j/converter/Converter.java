package ru.job4j.ru.job4j.converter;

public class Converter {

        public static int rubleToEuro(int value) {
            int rsl = value / 70;
            return rsl;
        }

        public static double rubleToDollar(double value) {
            double rsl = value / 60; /* формула перевода рублей в доллары. */
            return rsl;
        }

        public static void main(String[] args) {
            int euro = Converter.rubleToEuro(140);
            double dollar = Converter.rubleToDollar(140.0);
            System.out.println("140 rubles are " + euro + " euro.");
            System.out.println("140 rubles are " + dollar + " dollar.");
        }
    }

