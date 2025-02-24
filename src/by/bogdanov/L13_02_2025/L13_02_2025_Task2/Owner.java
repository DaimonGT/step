package by.bogdanov.L13_02_2025.L13_02_2025_Task2;

public class Owner {

    private int id;

    private String name;

    private String surName;

    private Pet[] pets = new Pet[0];

    private static int totalOwners = 0;

    private int size;

    // статический блок
    static {
        System.out.println("Класс Owner загружен в память!");
    }

    // коструктор для 2-го способа генерации рандомного хозяина
    public Owner(String name, String surName) {
        this.id = ++totalOwners;
        this.name = name;
        this.surName = surName;
    }

    // Добавление питомца
    public void addPet(Pet pet) {
        if (size < pets.length) {
            pets[size++] = pet;
        } else {
            Pet[] pets1 = new Pet[pets.length + 1];
            for (int i = 0; i < pets.length; i++) {
                pets1[i] = pets[i];
            }
            pets1[size++] = pet;
            pets = pets1;
        }
        pet.setOwner(this); // this - текущий owner
    }

    // Возвращение общего кол-ва владельцев
    public int getTotalOwners() {
        return totalOwners;
    }

    // геттеры
    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getId() {
        return id;
    }

    public Pet[] getPets() {
        return pets;
    }

    // сеттеры

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    // метод toString для вывода имени и фамилии владельца и кол-во питомцев
    @Override
    public String toString() {
        return name + " " + surName + ", " + pets.length + " домашних животных";
    }
}
