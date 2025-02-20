package by.bogdanov.L03_02_2025.library;

public class Library {
    private Book[] books;
    private int size;

    // Метод задающий размер размер массива
    public Library(int capacity) {
        books = new Book[capacity];
    }

    // метод добавляющий книгу в библиотеку
    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
        } else {
            Book[] books1 = new Book[books.length + 1];
            for (int i = 0; i < books.length; i++) {
                books1[i] = books[i];
            }
            books1[size++] = book;
            books = books1;
        }
    }

    // Метод выводящий список книг
    public void printBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }

    // Метод ищущий книгу по названию
    public Book findBook(String nameBook) {
        Book temp = null; // переменная, если книга в списке не найдена
        for (int i = 0; i < books.length; i++) {
            if (nameBook.equals(books[i].getTitle())) {
                temp = books[i];
                break;
            }
        }
        return temp;
    }

    // Метод сортирующий массив книг по году издания (новые идут первыми)
    public void sortBooksByYear() {
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (books[j] == null || books[j + 1] == null) {
                    continue;
                }
                if (books[j].getYear() < books[j + 1].getYear()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    // Метод сортирующий массив книг по году рождения автора (новые идут первыми)
    public void sortBooksByAuthorBirthYear() {
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (books[j] == null || books[j + 1] == null) {
                    continue;
                }
                if (books[j].getAuthor().getBirthYear() < books[j + 1].getAuthor().getBirthYear()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }
}