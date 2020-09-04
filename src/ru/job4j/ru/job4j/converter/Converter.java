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
            int in = 140;
            int expected = 2;
            int out = Converter.rubleToEuro(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2. Test result : " + passed);

            double inDollar = 140;
            double expectedDollar = 2.3333333333333335;
            double outDollar = Converter.rubleToDollar(inDollar);
            boolean passedDollar = expectedDollar == outDollar;
            System.out.println("140 rubles are 2.3333333333333335. Test result : " + passedDollar);

        }
    }

