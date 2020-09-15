package ru.job4j.ru.job4j.loop;

public class Mortgage {
        public static int year(int amount, int salary, double percent) {
            int year = 0;
            double dept = amount;
            while (dept > 0) {
                 dept = (percent / 100) * dept + dept - salary;
                year += 1;
            }
            return year;
        }
    }

