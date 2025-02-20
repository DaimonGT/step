package by.bogdanov.L27_01_2025;

import java.util.Random;

public class RecruitGenerator {
    private String[] name = {"Александр", "Владимир", "Максим", "Сергей", "Алексей", "Михаил", "Роман", "Олег", "Владислав", "Николай"};
    private String[] lastName = {"Кузнецов", "Петров", "Богданов", "Козлов", "Раков", "Солдатов", "Соколов", "Шматко", "Волик", "Баранов"};
    private String[] middleName = {"Владимирович", "Александрович", "Антонович", "Сергеевич", "Николаевич", "Аркадьевич", "Валериевич", "Викторович", "Григорьевич", "Вячеславович"};
    Random num = new Random();

    public Recruit generate() {
        String randomName = name[num.nextInt(name.length)];
        String randomLastName = lastName[num.nextInt(lastName.length)];
        String randomMiddleName = middleName[num.nextInt(middleName.length)];
        double randomVisionCoeff = num.nextDouble(0, 2);
        boolean randomFlatFeet = num.nextBoolean();
        int randomImplantCount = num.nextInt(5);
        int randomCardiogram = num.nextInt(50, 150);
        return new Recruit(randomLastName, randomName
                , randomMiddleName, randomVisionCoeff, randomFlatFeet, randomImplantCount
                , randomCardiogram);
    }
}