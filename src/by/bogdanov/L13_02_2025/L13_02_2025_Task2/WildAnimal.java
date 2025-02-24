package by.bogdanov.L13_02_2025.L13_02_2025_Task2;

public abstract class WildAnimal extends Animal {

    private String area;

    public WildAnimal(String name, String species, int age, String area) {
        super(name, species, age);
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString() + "( Дикое животное, среда обитания: " + area + ")";
    }

    public void hunt() {
        System.out.println(super.getName() + " охотится в " + area);
    }

}
