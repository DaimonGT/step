package by.bogdanov.L13_02_2025.L13_02_2025_Task2;

import java.util.Random;

public  class PetFactory {
    private String namePet;
    private static String[] arrNamePets = new String[3];
    private String speciec;
    private static String arrpSecieces[] = new String[3];
    private int agePet;
    Random randomNum = new Random();

    static {
        arrNamePets[0] = "Барсик";
        arrNamePets[1] = "Мурка";
        arrNamePets[2] = "Тузик";

        arrpSecieces[0] = "Собака";
        arrpSecieces[1] = "Кошка";
        arrpSecieces[2] = "Птичка";

    }

    public PetFactory(String namePet, String speciec, int agePet) {
        this.namePet = namePet;
        this.speciec = speciec;
        this.agePet = agePet;
    }
}
