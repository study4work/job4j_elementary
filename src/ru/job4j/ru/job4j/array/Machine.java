package ru.job4j.ru.job4j.array;
import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = money - price;
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            while (size - coins[i] >= 0) {
                size = size - coins[i];
                rsl[count++] = coins[i];
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
