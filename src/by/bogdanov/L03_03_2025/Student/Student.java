package by.bogdanov.L03_03_2025.Student;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " " + age + " Средний балл: " + grade;
    }
}
