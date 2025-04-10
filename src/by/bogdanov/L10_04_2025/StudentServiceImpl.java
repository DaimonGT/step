package by.bogdanov.L10_04_2025;

public class StudentServiceImpl implements StudentService{
    @Override
    public void enroll(String name) {
        System.out.println("Добавлен студент " + name);
    }

    @Override
    public void printALL() {
        System.out.println("Список всех студентов...");
    }
}
