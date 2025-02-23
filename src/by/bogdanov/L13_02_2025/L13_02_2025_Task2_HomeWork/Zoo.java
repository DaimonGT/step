package by.bogdanov.L13_02_2025.L13_02_2025_Task2_HomeWork;

public class Zoo {
    public static void main(String[] args) {
        OwnerFactory ownerFactory = new OwnerFactory();
        PetFactory petFactory = new PetFactory();
        Owner[] arrayOwners = new Owner[100];
        Pet[] arrayPets = new Pet[200];

        // Создание рандомных владельцев и добавление рандомного питомца
        for (int i = 0; i < arrayOwners.length; i++) {
            arrayOwners[i] = ownerFactory.next();
            for (int j = 0; j < arrayPets.length; j++) {
                arrayPets[j] = petFactory.next();
                arrayOwners[i].addPet(arrayPets[j]);
            }
            System.out.println(arrayOwners[i] + " " + arrayPets.length);
        }
    }
}
