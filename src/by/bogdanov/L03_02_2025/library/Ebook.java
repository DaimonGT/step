package by.bogdanov.L03_02_2025.library;

public class Ebook extends Book {

    private int fileSize;

    public Ebook(String title, Author author, int year, int fileSize) {
        super(title, author, year);
        this.fileSize = fileSize;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " fileSize " + fileSize + " Мб";
    }

    @Override
    public String toString() {
        return super.toString() + " fileSize " + fileSize + " Мб";
    }

}
