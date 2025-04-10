package by.bogdanov.L10_04_2025;
// Декоратор
public class LoggingStudentServiceDecorator implements StudentService {
    private final StudentService delegate;

    public LoggingStudentServiceDecorator(StudentService delegate) {
        this.delegate = delegate;
    }

    @Override
    public void enroll(String name) {
        // ополнительная логика
        System.out.println("[LOG] вызов метода enroll");
        delegate.enroll(name);

    }

    @Override
    public void printALL() {
        System.out.println("[LOG] вызов метода printALL");
        delegate.printALL();
    }
}
