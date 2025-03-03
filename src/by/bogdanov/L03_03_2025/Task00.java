package by.bogdanov.L03_03_2025;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Task00 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>();
        stringList.add("Dima");
        stringList.add("Vova");
        System.out.println("Размер коллекции stringList " + stringList.size());
        stringList2.add("Dima");
        stringList2.add("Sasha");
        System.out.println();
        stringList.addAll(stringList2);
        System.out.println("Размер коллекции stringList " + stringList.size());
        System.out.println(stringList);

        stringList.clear();
        System.out.println(stringList);
        System.out.println(stringList.size());

        stringList.add("Dima");
        stringList.add("Sasha");
        boolean isDimaContains = stringList.contains("Dima"); // входит ли элемент в коллекцию
        System.out.println(isDimaContains);
        boolean containsAll = stringList.containsAll(stringList2); // входят ли элементы массива в другой массив
        System.out.println(containsAll);
        if (stringList.isEmpty()) { // пустая ли коллекция
            System.out.println();
        }
        boolean equals = stringList.equals(stringList2); // равны ли коллекции между собой
        System.out.println(equals);
        String s = stringList.get(0); // получение элемента по индексу из коллекции
        System.out.println(s);

        int i = stringList.indexOf("Dima"); // получить индекс элемента из коллекции
        System.out.println(i);

        stringList.remove("Dima"); // удалить элемент из коллекции
        System.out.println(stringList);
        stringList.set(0, "Dasha"); // положить элемент в коллецию по индексу

        String[] array = stringList.toArray(new String[0]);
        List<String> k = new ArrayList<>(20);// массив из 20 элементов
        test();
    }

    public static void test() {
        Car audi = new Car("Audi", 1999);
        Car bmw = new Car("BMW", 1992);
        List<Car> cars = new ArrayList<>();
        cars.add(audi);
        cars.add(bmw);
        for (Car car : cars) {
            if (car.getYear() == 1999) {
                System.out.println(car);
            }
        }
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car next = iterator.next();
            if (iterator.next().getYear() == 2005) {
                iterator.remove();
                break;
            }
        }
        System.out.println(cars);
    }
}
