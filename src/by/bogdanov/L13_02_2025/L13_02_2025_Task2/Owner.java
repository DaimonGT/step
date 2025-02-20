package by.bogdanov.L13_02_2025.L13_02_2025_Task2;

import java.util.Random;

public class Owner {
    private int id;
    private String name;
    private String surName;
    private static String[] names = new String[5];
    private static String[] surNames = new String[5];
    private Pet[] pets = new Pet[5];
    private static int totalOwners = 0;
    private int size;
    private Random random = new Random();

    // статический блок
    static {
        System.out.println("Класс Owner загружен в память!");
        names[0] = "Дима";
        names[1] = "Оля";
        names[2] = "Саша";
        names[3] = "Настя";
        names[4] = "Рома";


        surNames[0] = "Романенко";
        surNames[1] = "Петренко";
        surNames[2] = "Маленко";
        surNames[3] = "Моисенко";
        surNames[4] = "Литвиненко";
    }

    // конструктор
    public Owner() {
        this.id = ++ totalOwners;
        this.name = names[random.nextInt(names.length)];
        this.surName = surNames[random.nextInt(surNames.length)];
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
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    // Возвращение общего кол-ва владельцев
    public int getTotalOwners() {
        return totalOwners;
    }

    // Добавление питомца
    public void addPet(Pet pet){
        if(size < pets.length) {
            pets[size++] = pet;
        }
        else {
            Pet[] pets1 = new Pet[pets.length + 1];
            for (int i = 0; i < pets.length; i++) {
                pets1[i] = pets[i];
            }
            pets1[size++] = pet;
            pets = pets1;
        }
        pet.setOwner(this); // this - экземпляр текущий owner, добавлет владельца к pet
    }
}
