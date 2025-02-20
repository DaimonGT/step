package by.bogdanov.L23_01_2025;

public class Product {
    String name;
    int price;
    int quantity;

    public Product() {
        System.out.println("Создали продукт");
    }
    public Product(String name,int price, int quantity){
        this.name = name; // this обращение к переменной в классе
        this.price = price;
        this.quantity = quantity;
    }
    int getTotalValue(){
        return price * quantity;
    }
}
