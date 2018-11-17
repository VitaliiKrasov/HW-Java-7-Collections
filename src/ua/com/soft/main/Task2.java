package ua.com.soft.main;

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
        Map<Integer, String> employeeMap = getMyEmploeyyMap();
        System.out.println(employeeMap);

        System.out.println("\nEnter ID:");
        Integer id = Integer.parseInt(reader.readLine());

        String nameById = getById(employeeMap, id);
        System.out.println(nameById);

        System.out.println("\nEnter name:");
        String name = reader.readLine();

        Integer idByName = getByName(employeeMap, name);
        System.out.println(idByName);
    }

    public static Map<Integer, String> getMyEmploeyyMap() {
        final Map<Integer, String> EMPLOYEE_MAP = new HashMap<Integer, String>(7);
        EMPLOYEE_MAP.put(20, "Vasia Pupkin");
        EMPLOYEE_MAP.put(30, "Eva Pupkina");
        EMPLOYEE_MAP.put(40, "Bob Marley");
        EMPLOYEE_MAP.put(50, "Elvis Presley");
        EMPLOYEE_MAP.put(60, "Donald Duck");
        EMPLOYEE_MAP.put(70, "Bob Rapid");
        EMPLOYEE_MAP.put(80, "Nick Noby");
        return EMPLOYEE_MAP;
    }

    public static String getById(Map<Integer, String> employeeMap, Integer id) {
        if (employeeMap.containsKey(id)) {
            return employeeMap.get(id);
        } else return "not exist";
    }

    public static Integer getByName(Map<Integer, String> employeeMap, String name) {
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(name)) {
                return entry.getKey();
            }
        } return -1;
    }

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
}
