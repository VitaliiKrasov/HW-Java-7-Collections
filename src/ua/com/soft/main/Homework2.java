package ua.com.soft.homework2;

import java.util.HashMap;
import java.util.Map;

/**
 * Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
 * Output the entities of the map on the screen.
 * There are at less two persons with the same firstName among these 10 people?
 * Remove from the map person whose firstName is ”Orest” (or other). Print result.
 */
public class Homework2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<String, String>(10);
        personMap.put("Vasia","Pupkin");
        personMap.put("Eva","Pupkina");
        personMap.put("Bob","Marley");
        personMap.put("Elvis","Presley");
        personMap.put("Orest","Pupkin");
        personMap.put("Alisa","Pupkina");
        personMap.put("Alisa","Duck");
        personMap.put("Donald","Duck");
        personMap.put("Mickey","Mouce");
        personMap.put("Minnie","Mouce");
        personMap.put("Pluto","Dog");

        System.out.println(personMap.size() + " " + personMap);

        personMap.remove("Orest");
        System.out.println(personMap.size() + " " + personMap);
    }
}
