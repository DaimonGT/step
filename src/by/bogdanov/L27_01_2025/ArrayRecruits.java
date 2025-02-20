package by.bogdanov.L27_01_2025;

public class ArrayRecruits {
    int size;
    Recruit[] recruits = new Recruit[size];

    // Метод добавления новобранца
    public void add(Recruit recruit) {
        if (size < recruits.length) {
            recruits[size] = recruit;
        } else {
            Recruit[] recruits1 = new Recruit[recruits.length + 1];
            for (int i = 0; i < recruits.length; i++) {
                recruits1[i] = recruits[i];
            }
            recruits1[size++] = recruit;
            recruits = recruits1;
        }
    }

    // Метод поиска новобранца по индексу
    public Recruit get(int index) {
        Recruit recruit = null;
        for (int i = 0; i < recruits.length; i++) {
            if (index == recruits[i].id) {
                recruit = recruits[i];
            }
        }
        return recruit;
    }

    // Метод получения размера массива
    public void getSize() {
        System.out.println(recruits.length);
    }

    // Метод сортировки по фамилиям доделать
    public void sortByLastName() {
        //Collections.sort(Arrays.asList(recruits), (recruit1, recruit2) -> recruit1.getLastName().compareTo(recruit2.getLastName()));

        for (int i = 0; i < recruits.length - 1; i++) {
            for (int j = 0; j < recruits.length - i - 1; j++) {
                if (recruits[j] == null || recruits[j + 1] == null) {
                    continue;
                }
                if (recruits[j].getLastName().compareTo(recruits[j + 1].getLastName()) > 0) {
                    Recruit temp = recruits[j];
                    recruits[j] = recruits[j + 1];
                    recruits[j + 1] = temp;
                }
            }
        }
    }
}