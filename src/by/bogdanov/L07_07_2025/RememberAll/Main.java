package by.bogdanov.L07_07_2025.RememberAll;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Dima", 25, 90.5),
                new Student("Sasha", 20, 88.5),
                new Student("Masha", 21, 97.5),
                new Student("Dasha", 19, 71.2),
                new Student("Roma", 24, 81.3));

        students.stream().filter(student -> student.getAge() > 20)
                .sorted(Comparator.comparingDouble(Student::getGrade))
                .map(student -> "Студент: " + student.getName() +" " + student.getGrade())
                .forEach(System.out::println);
    }
}
