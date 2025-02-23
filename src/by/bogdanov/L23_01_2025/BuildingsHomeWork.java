package by.bogdanov.L23_01_2025;

public class BuildingsHomeWork {
    int windows;
    int doors;
    String street;
    String materials;
    int height;
    int yearBuilt;

    // Констуктор (названиее конструктора должно быть такое же как и у класса?)
    public BuildingsHomeWork(int windows, int doors, String street, String materials){
        this.windows = windows;
        this.doors = doors;
        this.street = street;
        this.materials = materials;
    }

    // второй конструктор
    public BuildingsHomeWork(int windows, int doors, String street, String materials, int height, int yearBuilt){
        this.windows = windows;
        this.doors = doors;
        this.street = street;
        this.materials = materials;
        this.height = height;
        this.yearBuilt = yearBuilt;

    }
    String getDescription(){
        return "Здание на улице " + street + ": " + windows + " окон, " + doors + " дверей, " + "из " + materials + " высотой " + height + ", построенное в " + yearBuilt + " году";
    }
}
