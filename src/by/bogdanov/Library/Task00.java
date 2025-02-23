package by.bogdanov.Library;

public class Task00 {
    public static void main(String[] args) {
        Library library = new Library(6);

        Author pushkin = new Author("Александр", "Пушкин", 1799);
        Book onegin = new Book("Евгений Онегин", pushkin, 1823);
        library.addBook(onegin);
        Book poltava = new Book("Полтава", pushkin, 1828);
        library.addBook(poltava);

        Author tolkien = new Author("Джон", "Толкин", 1892);
        Book lordOfTherings = new Book("Властелин колец", tolkien, 1954);
        library.addBook(lordOfTherings);
        Book lordOfTherings2 = new Book("Властелин колец 2", tolkien, 1955);
        library.addBook(lordOfTherings2);

        Author gorky = new Author("Максим", "Горький", 1868);
        Book chelkash = new Book("Челкаш", gorky, 1894);
        library.addBook(chelkash);
        Book mother = new Book("Мать", gorky, 1890);
        library.addBook(mother);

        System.out.println("Все книги:");
        library.printBooks();

        System.out.println("Поиск книги 'Властелин колец':");
        System.out.println(library.findBook("Властелин колец"));

        System.out.println("Книги после сортировки по году издания:");
        library.sortBooksByYear();
        library.printBooks();

        System.out.println("Книги после сортировки по году рождения автора:");
        library.sortBooksByAuthorBirthYear();
        library.printBooks();
    }
}
