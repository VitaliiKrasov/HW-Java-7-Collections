package ua.com.soft.homework3;

import java.util.*;

/**
 * Write class Student that provides information about the name of the student and his course.
 * Class Student should consists of
 *  - properties for access to these fields
 *  - constructor with parameters
 *  - method getStudentsByCourse (List students, Integer course),
 *  which receives a list of students and the course number
 *  and prints to the console the names of the students from the list,
 *  which are taught in this course (use an iterator)
 *  - methods to compare students by name and by course
 * In the main() method
 *  declare List students and add to the list five different students
 *  display the list of students ordered by name
 *  display the list of students ordered by course.
 */
public class Student {
    private String name;
    private Integer course;

    public Student(String name, int course) {
        this.name = name;
        this.course = (Integer) course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = (Integer) course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course.intValue();
    }

    static String getStudentsByCourse(List<Student> students, Integer course){
        String result = "";
        for (Student student : students) {
            if(student.getCourse() == course) {
                result += student.getName() + "\n";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(0, new Student("Vasia Pupkin", 1));
        students.add(1, new Student("Eva Pupkina", 2));
        students.add(2, new Student("Bob Marley", 3));
        students.add(3, new Student("Elvis Presley", 3));
        students.add(4, new Student("Donald Duck", 3));

        for (Student student : students) {
            System.out.println(student.getName());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter course");
        int course = scanner.nextInt();
        System.out.println(getStudentsByCourse(students, course));
    }
}
