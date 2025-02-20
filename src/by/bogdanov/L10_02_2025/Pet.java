package by.bogdanov.L10_02_2025;

public abstract class Pet extends Animal {
    String holderName;

    public Pet(String name, String species, int age, String holderName) {
        super(name, species, age);
        this.holderName = holderName;
    }

    @Override
    public String toString() {
        return super.toString() + " Домашнее животное, хозяин: " + holderName;
    }

    public void play(){
        System.out.println(super.getName() + " играет с хозяином " + holderName);
    }
}
