package by.bogdanov.L27_03_2025;

import by.bogdanov.L10_02_2025.Cat;

import java.util.List;

public class Task00 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Привет");
        String item = stringBox.getItem();
        System.out.println(item);

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(12);
        Integer item1 = integerBox.getItem();
        System.out.println(item1);
        printTwice("Привет");
        printTwice(18);
        printTwice(integerBox);

        Pair<String, Integer> student = new Pair<>("Дима", 20);
        System.out.println(student.getKey());
        System.out.println(student.getValue());
        List<Integer> integers = List.of(1, 2, 3);
        printList(integers);
        List<String> stringList = List.of("1", "2", "3");
        //printList(stringList); // ругается, т.к. метод наследуется от Number

    }

    public static <T> T printTwice(T value) { // типизированный метод(обязательно указать <Т>)
        System.out.println(value);
        System.out.println(value);
        return value;

    }

    public static void printList(List<? extends Number> list) { // метод принимает значения, которые наследуются отNumber
        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static void printList1(List<? super Cat> list) {
        Object object = list.get(1);
    }

    public static void printList2(Box<? extends Number> item) {
    }

}
