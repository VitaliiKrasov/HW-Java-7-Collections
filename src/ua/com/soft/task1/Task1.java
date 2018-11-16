package ua.com.soft.task1;

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
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(25);
        }

        List<Integer> myCollection = new ArrayList<Integer>(10);
        for (int i : myArray) {
            myCollection.add((Integer) i);
        }
        System.out.println("myCollecton:\n" + myCollection.size() + " " + myCollection);

        List<Integer> newCollection = new LinkedList<Integer>();
        for (Integer integer : myCollection) {
            if (integer > 5) {
                newCollection.add((Integer) myCollection.indexOf(integer));
            }
        }
        System.out.println("newCollecton:\n" + newCollection.size() + " " + newCollection);

        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer > 20) {
                iterator.remove();
            }
        }
        System.out.println("myCollecton after removing:\n" + myCollection.size() + " " + myCollection);

        if (myCollection.size() > 8) {
            myCollection.add(2, (Integer) 1);
            myCollection.add(8, (Integer) (-3));
            myCollection.add(5, (Integer) (-4));
        } else System.out.println("myColllection size = " + myCollection.size() + ", can`t add 8-s element");
        System.out.println("myCollecton after inserts:\n" + myCollection.size() + " " + myCollection);

        Collections.sort(myCollection);
        System.out.println("myCollecton sorted:\n" + myCollection.size() + " " + myCollection);

        System.out.println(getPositionsAndValues(myCollection));
    }
    static String getPositionsAndValues(List<Integer> list) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += String.format("position - %1$s, value of element - %2$s\n",i,list.get(i));
        }
        return result;
    }
}
