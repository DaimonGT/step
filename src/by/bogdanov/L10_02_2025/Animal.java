package by.bogdanov.L10_02_2025;

public abstract class Animal {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return species + " по имени " + name + " , возрвст: " + age + " года";
    }


    // абстактные методы
    public abstract void makeSound();

    public abstract void move();

    public abstract void eat();
}
