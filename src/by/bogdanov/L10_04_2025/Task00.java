package by.bogdanov.L10_04_2025;

public class Task00 {
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();
/*        System.out.println(singletonExample);
        System.out.println(singletonExample2);*/

        // создаем студента
        Student student = new Student.Builder("Дима")
                .age(35)
                .email("mail@mail.ru")
                .city("Витебск")
                .build();
        //
        StudentService studentService = new StudentServiceImpl();
        StudentService studentServiceLogging = new LoggingStudentServiceDecorator(studentService);
        studentServiceLogging.enroll("Дима");
        studentServiceLogging.printALL();

    }
    private static void test(StudentService studentService){
        studentService.printALL();

    }
}
