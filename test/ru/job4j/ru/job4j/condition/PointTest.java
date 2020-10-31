package ru.job4j.ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

    public class PointTest {
        @Test
        public void when00to20then2() {
            int expected = 2;
            Point a = new Point(0, 0);
            Point b = new Point(0, 2);
            double dist = a.distance(b);
            Assert.assertEquals(expected, dist, 0.01);
        }

        @Test
        public void when20to20then0() {
            int expected = 0;
            Point a = new Point(2, 0);
            Point b = new Point(2, 0);
            double dist = a.distance(b);
            Assert.assertEquals(expected, dist, 0.01);
        }

        @Test
        public void when33to23then1() {
            int expected = 1;
            Point a = new Point(3, 3);
            Point b = new Point(2, 3);
            double dist = a.distance(b);
            Assert.assertEquals(expected, dist, 0.01);
        }

        @Test
        public void when45to88then5() {
            int expected = 5;
            Point a = new Point(4, 5);
            Point b = new Point(8, 8);
            double dist = a.distance(b);
            Assert.assertEquals(expected, dist, 0.01);
        }

        @Test
        public void when823to943to653then7() {
            double expected = 7;
            Point a = new Point(8, 2, 3);
            Point b = new Point(9, 4, 3);
            double dist = a.distance3d(b);
            Assert.assertEquals(expected, dist, 0.1);
        }
    }
