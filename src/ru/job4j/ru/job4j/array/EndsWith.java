package ru.job4j.ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        for (int i = 0; i < post.length; i++) {
            if (post[i] != word[word.length - post.length + i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
