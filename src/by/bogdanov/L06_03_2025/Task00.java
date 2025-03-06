package by.bogdanov.L06_03_2025;

import by.bogdanov.L03_03_2025.Student.Student;
import by.bogdanov.L03_03_2025.Student.StudentFactory;

import java.util.*;

public class Task00 {
    public static void main(String[] args) {;
        Set<Student> students = new HashSet<>();
        Set<Student> studentsLinked = new LinkedHashSet<>();
        Set<Student> studentsTreeset = new TreeSet<>();
        for (int i = 0; i < 10; i++){
            Student next = StudentFactory.next();
            System.out.println(next);
            students.add(next);
            studentsLinked.add(next);
            studentsTreeset.add(next);
        }
        List<Student> students1 = new ArrayList<>(students);
        System.out.println(students);
        System.out.println(students.size());
        System.out.println("______________________");
        System.out.println(studentsLinked);
        System.out.println(studentsLinked.size());
        System.out.println("________________________");
        System.out.println(studentsTreeset);
        System.out.println(studentsTreeset.size());
    }
}
