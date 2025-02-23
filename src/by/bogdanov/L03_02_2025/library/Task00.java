package by.bogdanov.L03_02_2025.library;

public class Task00 {
    public static void main(String[] args) {
        Library library = new Library(6);

        Author tolkien = new Author("Джон", "Толкин", 1892);
        Book lordOfTherings = new Book("Властелин колец", tolkien, 1955);
        library.addBook(lordOfTherings);
        Book lordOfTherings2 = new Book("Властелин колец-2", tolkien, 1965);
        library.addBook(lordOfTherings2);

        Author pushkin = new Author("Адлександр", "Пушкин", 1799);
        Book poltava = new Book("Полтава", pushkin, 1828);
        library.addBook(poltava);
        Book onegin = new Book("Евгений Онегин", pushkin, 1823);
        library.addBook(onegin);

        Author tolstoy = new Author("Лев", "Толстой", 1828);
        Book childhood = new Book("Детство", tolstoy, 1852);
        library.addBook(childhood);
        Book karenina = new Book("Анна Каренина", tolstoy, 1873);
        library.addBook(karenina);

        System.out.println("Все книги:");
        System.out.println("_______________________________________");
        library.printBooks();
        System.out.println();

        System.out.println("Поиск книги 'Детство':");
        System.out.println(library.findBook("Детство"));
        System.out.println();

        System.out.println("Книги после сортировки по году издания:");
        System.out.println("_______________________________________");
        library.sortBooksByYear();
        library.printBooks();
        System.out.println();

        System.out.println("Книги после сортировки по году рождения автора:");
        System.out.println("_______________________________________________");
        library.sortBooksByAuthorBirthYear();
        library.printBooks();

    }
}
