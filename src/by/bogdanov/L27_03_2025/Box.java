package by.bogdanov.L27_03_2025;

public class Box<T> { //box будет работать с неким типом Т (сделать класс типизированным)
    private T item; // T - это тип

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
