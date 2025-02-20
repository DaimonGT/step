package by.bogdanov.L13_02_2025.L13_02_2025_Task2;

import java.util.Random;

public abstract class Pet extends Animal {
    private Owner owner;


    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getHolderName() {
        if (holderName == null) {
            return "Без владельца";
        }
        return holderName;
    }

    String holderName;
    protected String holderSurName;


    public Pet(String name, String species, int age, String holderName) {
        super(name, species, age);
    }

    @Override
    public String toString() {
        return super.toString() + " Домашнее животное, хозяин: " + owner.getName() + " " + owner.getSurName() + " " + owner.getSex();
    }

    public void play(){
        System.out.println(super.getName() + " играет с хозяином " + owner.getName() + " " + owner.getSex());
    }
}
