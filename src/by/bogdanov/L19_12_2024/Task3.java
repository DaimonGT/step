package by.bogdanov.L19_12_2024;

public class Task3 {
    public static void main(String[] args) {
        int weight = 75;
        int height = 193;
        int weightIdeal = height - 110;
        if (weightIdeal == weight) {
            System.out.println("Вес идеален");
        } else if (weightIdeal > weight) {
            int weightNeed = weightIdeal - weight;
            System.out.println("Мне нужно набрать " + weightNeed + " кг");
        } else {
            int weightMore = weight - weightIdeal;
            System.out.println("Мне нужно сбросить " + weightMore + " кг");
        }
    }
}
