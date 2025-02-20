package by.bogdanov.L03_02_2025.library;

public class Author {
    private String name;
    private String surname;
    private int birthYear;

    // конструктор
    public Author(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    // метод возвращающий строку "Фамилия имя - год рождения"
    @Override
    public String toString() {
        return surname + " " + name + " - " + birthYear;
    }

    // методы get для получения переменных
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
