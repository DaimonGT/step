package by.bogdanov.L23_01_2025;
// создание для объектов здания (эскиз)
public class Building {

    // Переменные класса для объектов
    int quantityWindow;
    int quantityDoors;
    String material;
    String street;

    // Конструктор
   public Building( int quantityWindow, int quantityDoors, String material, String street){
        this.quantityWindow = quantityWindow;
        this.quantityDoors = quantityDoors;
        this.material = material;
        this.street = street;
    }

    // метод с возвратом строки (String)
    String getDescription() {
        return "Здание на улице " + street
                + " : " + quantityWindow + " окон" + " , " + quantityDoors
                + " дверей, из " + material;
    }
}