package ua.com.soft.test;

import org.testng.annotations.Test;
import ua.com.soft.main.Homework1;

import java.util.HashSet;
import java.util.Set;

import static org.testng.Assert.*;
import static ua.com.soft.main.Homework1.intersect;
import static ua.com.soft.main.Homework1.union;

public class Homework1Test {
    @Test
    public void testUnion() {
//Arrange
        Set<Integer> testSet1 = new HashSet<>();
        testSet1.add(3);
        testSet1.add(4);
        testSet1.add(5);
        Set<Integer> testSet2 = new HashSet<>();
        testSet2.add(5);
        testSet2.add(7);
        testSet2.add(9);
        Set<Integer> expected = new HashSet<>();
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(7);
        expected.add(9);
//Act
//Assert
        assertEquals(union(testSet1, testSet2), expected);
    }

    @Test
    public void testIntersect() {
//Arrange
        Set<Integer> testSet1 = new HashSet<>();
        testSet1.add(3);
        testSet1.add(4);
        testSet1.add(5);
        Set<Integer> testSet2 = new HashSet<>();
        testSet2.add(5);
        testSet2.add(7);
        testSet2.add(9);
        Set<Integer> expected = new HashSet<>();
        expected.add(5);
//Act
//Assert
        assertEquals(intersect(testSet1, testSet2), expected);
    }
}