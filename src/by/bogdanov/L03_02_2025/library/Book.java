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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return title + " (" + year + ") - " + author;
    }
}