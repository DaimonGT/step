package by.bogdanov.Library;

public class Library {
    Book[] books; // Почему нельзя задать переменну с именем book?
    int size;

    public Library(int capacity) {
        books = new Book[capacity];
    }

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

    public void printBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }

    public Book findBook (String nameBook) {
        Book temp  = null;
        for (int i = 0; i < books.length; i++) {
            if (nameBook.equals(books[i].getTitle())) {
                temp = books[i];
                break;
            }
        }
        return temp;
    }

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

    public void sortBooksByAuthorBirthYear() {
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if(books[j].getAuthor().getBirthYear() < books[j + 1].getAuthor().getBirthYear()) {
                    Book num = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = num;
                }
            }
        }
    }

}
