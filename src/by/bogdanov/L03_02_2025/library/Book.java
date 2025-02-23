package by.bogdanov.L03_02_2025.library;

public class Book {
    private String title;
    private Author author;
    private int year;

    // Конструктор
    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Пустой конструктор
    public Book() {
    }

    // Метод toString(), который возвращает строку вида "Название (Год издания) - Автор"
    @Override
    public String toString() {
        return title + " (" + year + ") - " + author;
    }

    // Методы get для получения переменных
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}