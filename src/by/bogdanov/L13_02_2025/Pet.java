package by.bogdanov.L13_02_2025;

import java.util.Random;

public abstract class Pet extends Animal {

    private static String[] surNames = new String[5];

    private Random random = new Random();


    static {
        surNames[0] = "Романенко";
        surNames[1] = "Петренко";
        surNames[2] = "Маленко";
        surNames[3] = "Тарасенко";
        surNames[4] = "Моисенко";

    }

    String holderName;
    protected String holderSurName;


    public Pet(String name, String species, int age, String holderName) {
        super(name, species, age);
        this.holderName = holderName;
        this.holderSurName = surNames[random.nextInt(surNames.length)]; // рандомное фамилия из массива
    }

    @Override
    public String toString() {
        return super.toString() + " Домашнее животное, хозяин: " + holderName + " " + holderSurName;
    }

    public void play(){
        System.out.println(super.getName() + " играет с хозяином " + holderName);
    }
}
