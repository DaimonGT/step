package by.bogdanov.L03_03_2025.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            students.add(StudentFactory.next());
        }
        System.out.println(students);
    }
    public void found(Student name) {

    }
}
