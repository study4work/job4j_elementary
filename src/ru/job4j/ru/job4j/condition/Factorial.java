package ru.job4j.ru.job4j.condition;

public class Factorial {
        public static int calc(int n) {
            int result = 1;
            for (int i = 0; i < n; i++) {
                result = result * (i + 1);
            }
            return result;
        }
}

