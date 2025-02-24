package by.bogdanov.L13_02_2025.L13_02_2025_Task2;

public abstract class Pet extends Animal {

    private Owner owner;

    public String getHolderName() {
        if (owner == null) {
            return "Без владельца";
        }
        return owner.getName();
    }

    public Pet(String name, String species, int age) {
        super(name, species, age);
    }

    public void play() {
        System.out.println(super.getName() + " играет с хозяином " + owner.getName());
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return super.toString() + " Домашнее животное, хозяин: " + owner.getName() + " " + owner.getSurName();
    }
}
