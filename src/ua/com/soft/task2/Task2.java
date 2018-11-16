package ua.com.soft.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * In the main() method declare map employeeMap of pairs <Integer, String>.
 * Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
 * Ask user to enter ID, then find and write corresponding name from your map.
 * If you can't find this ID - say about it to user (use function containsKey()).
 * Ask user to enter name, verify than you have name in your map and write corresponding ID.
 * If you can't find this name - say about it to user (use function containsValue()).
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        Map<Integer, String> employeeMap = new HashMap<Integer, String>(7);
        employeeMap.put(20, "Vasia Pupkin");
        employeeMap.put(30, "Eva Pupkina");
        employeeMap.put(40, "Bob Marley");
        employeeMap.put(50, "Elvis Presley");
        employeeMap.put(60, "Donald Duck");
        employeeMap.put(70, "Bob Rapid");
        employeeMap.put(80, "Nick Noby");

        System.out.println(employeeMap);
//
        System.out.println("\nEnter ID:");
        Integer id = Integer.parseInt(reader.readLine());
        if (employeeMap.containsKey(id)) {
            String finded = employeeMap.get(id);
            System.out.println(finded);
        } else System.out.println("not exist");

        System.out.println("\nEnter name:");
        String name = reader.readLine();
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(name)) {
                Integer finded = entry.getKey();
                System.out.println(finded);
            }
        }

    }

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
}
