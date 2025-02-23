package by.bogdanov.BooksExample;

public class ClassTheme {
    int many;
    int day;
}

class Many{
    static public void main(String[] args) {
        ClassTheme MyMany = new ClassTheme();
        MyMany.many = 1000;
        MyMany.day = 30;
        int a = MyMany.many * MyMany.day;
        System.out.println(a);
    }
}