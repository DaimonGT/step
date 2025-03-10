package by.bogdanov.L10_03_2025;

import by.bogdanov.L03_03_2025.Student.Student;
import by.bogdanov.L03_03_2025.Student.StudentFactory;

import java.util.*;

public class Task00 {
    public static void main(String[] args) {
        Student student1 = new Student("Dima", 17, 7);
        Student student2 = new Student("Sasha", 18, 9);
        Student student3 = new Student("Masha", 18, 9);
        Map<Integer, Student> mapGradeToStudent = new HashMap<>();
        mapGradeToStudent.put(student1.getAge(), student1); // положить в Мар
        mapGradeToStudent.put(student2.getAge(), student2);
        mapGradeToStudent.putIfAbsent(student3.getAge(), student3); // заменит Sasha т.к ключ age одинаковый
        Student student = mapGradeToStudent.get(17);
        boolean containsStudent2 = mapGradeToStudent.containsValue(student2); // проверяет есть ли такой объект
        Set<Integer> ages = mapGradeToStudent.keySet(); // получить все ключи
        for(Map.Entry<Integer, Student>entry: mapGradeToStudent.entrySet()){ // получить все ключи и значения
            Student value = entry.getValue();
            Integer key = entry.getKey();
            System.out.println(key);
            System.out.println(value);
        }
        mapGradeToStudent.getOrDefault(90, new Student("Marina", 20, 10)); // ищет по ключу, если нет, то вернет укзанное значение
        mapGradeToStudent.remove(34); // удалит объект по ключу
        Map<Integer, List<Student>> ageStudentsMap = new HashMap<>();
        List<Student> students = new ArrayList<>();
        students.add(student1);
        ageStudentsMap.put(student1.getAge(), students);
        //List<Student> students1 = ageStudentsMap.get(student1.getAge());
        //students1.add(student2);

        List<Student> students2 = List.of(student1, student2, student3);
        for (Student s : students2) {
            ageStudentsMap.putIfAbsent(s.getAge(), new ArrayList<>()); // создает новую коллекцию
            List<Student> list = ageStudentsMap.get(s.getAge()); // получает новую коллекцию
            list.add(s); // заменяет коллекцию
        }
        System.out.println(ageStudentsMap);
        //System.out.println(student);
        //System.out.println(mapGradeToStudent);
    }
}
