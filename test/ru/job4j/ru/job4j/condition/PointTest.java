package ru.job4j.ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

    public class PointTest {
        @Test
        public void when00to20then2() {
            int expected = 2;
            int x1 = 0;
            int y1 = 0;
            int x2 = 2;
            int y2 = 0;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when20to20then0() {
            int expected = 0;
            int x1 = 2;
            int y1 = 0;
            int x2 = 2;
            int y2 = 0;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when33to23then1() {
            int expected = 1;
            int x1 = 3;
            int y1 = 3;
            int x2 = 2;
            int y2 = 3;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when45to88then5() {
            int expected = 5;
            int x1 = 4;
            int y1 = 5;
            int x2 = 8;
            int y2 = 8;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }
    }
