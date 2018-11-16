package ua.com.soft.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Declare collection myCollection of 10 int and fill it (from console or of random)
 * Find and save in list newCollection all positions of element more then 5 in the collection.
 * Print new collection.
 * Remove from myCollecton elements, wich are greater then 20. Print result.
 * Insert elements 1, -3, -4 in positions 2, 8, 5.
 * Print result in the format "position - xxx, value of element - xxx"
 * Sort end print collection.
 */

public class Task1 {
    public static void main(String[] args) throws IOException {
        int[] myArray = new int[10];
        myArray = getRandomInts(myArray.length);

        List<Integer> myCollection = getListFromArray(myArray);
        System.out.println("myCollecton:\n" + getPositionsAndValues(myCollection));

        List<Integer> newCollection = getPositionsOfValuesMoreThen(myCollection, 5);
        System.out.println("newCollecton:\n" + getPositionsAndValues(newCollection));

        removeValuesMoreThen(myCollection, 20);
        System.out.println("myCollecton after removing:\n" + getPositionsAndValues(myCollection));

        if(customInsert(myCollection)){
            System.out.println("myCollecton after inserts:\n" + getPositionsAndValues(myCollection));
        } else System.out.println("myColllection size = " + myCollection.size() + ", can`t add 8-s element");

        Collections.sort(myCollection);
        System.out.println("myCollecton after sorting:\n" + getPositionsAndValues(myCollection));

        System.out.println(getPositionsAndValues(myCollection));
    }

    static boolean customInsert(List<Integer> myCollection) {
        if (myCollection.size() > 5) {
            myCollection.add(2, (Integer) 1);
            myCollection.add(8, (Integer) (-3));
            myCollection.add(5, (Integer) (-4));
            return true;
        } else return false;

    }

    static void removeValuesMoreThen(List<Integer> myCollection, int limit) {
        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer > limit) {
                iterator.remove();
            }
        }
    }

    static List<Integer> getPositionsOfValuesMoreThen(List<Integer> myCollection, int limit) {
        List<Integer> newCollection = new LinkedList<Integer>();
        for (Integer integer : myCollection) {
            if (integer > limit) {
                newCollection.add((Integer) myCollection.indexOf(integer));
            }
        }
        return newCollection;
    }

    static List<Integer> getListFromArray(int[] myArray) {
        List<Integer> myCollection = new ArrayList<Integer>(myArray.length);
        for (int i : myArray) {
            myCollection.add((Integer) i);
        }
        return myCollection;
    }

    static int[] getRandomInts(int length) {
        Random random = new Random();
        int[] myArray = new int[length];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(25);
        }
        return myArray;
    }

    static String getPositionsAndValues(List<Integer> list) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += String.format("position - %1$s, value of element - %2$s\n",i,list.get(i));
        }
        return result;
    }
}
