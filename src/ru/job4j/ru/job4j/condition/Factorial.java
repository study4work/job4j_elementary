package ru.job4j.ru.job4j.condition;

public class Factorial {
        public static int calc(int n) {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result = result * i;
            }
            return result;
        }
}

