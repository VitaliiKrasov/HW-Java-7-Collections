package ua.com.soft.main;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
 * realizing the operations of union and intersection of two sets.
 * Test the operation of these techniques on two pre-filled sets.
 */

public class Homework1 {
    public static void main(String[] args) {

    }

    public static Set union(Set set1, Set set2) {
        Set result = new HashSet();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }

    public static Set intersect(Set set1, Set set2) {
        Set result = new HashSet();
        for (Object o : set1) {
            if (set2.contains(o)) {
                result.add(o);
            }
        }
        return result;
    }
}
