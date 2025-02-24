package by.bogdanov.L13_02_2025.L13_02_2025_Task2;

public class Zoo {

    public static void main(String[] args) {
        Owner[] arrayOwners = new Owner[100];

        // Создание рандомных владельцев и добавление рандомного питомца
        for (int i = 0; i < arrayOwners.length; i++) {
            arrayOwners[i] = OwnerFactory.next();
            for (int j = 0; j < 200; j++) {
                Pet pet = PetFactory.next();
                arrayOwners[i].addPet(pet);
            }
            System.out.println(arrayOwners[i]);
        }
        Swimable[] swimables = new Swimable[1];
        swimables[0] = new Bird("Утка", 5);
        for (Swimable swimable : swimables) {
            swimable.swim();
            if (swimable instanceof Bird bird) {
                bird.move();
            }
        }
        Flyable[] flyable = new Flyable[1]; //
        flyable[0] = new Bird("Утка", 10);
    }

}
