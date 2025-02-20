package by.bogdanov.L13_01_2025;

// Реализуйте метод, который объеденяет два массива в один
public class Task07 {
    static public void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = new int[6];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
            System.out.print(array3[i] + " ");
        }
        for (int i = 3; i < array3.length; i++) {
            array3[i] = array2[0];
            array2[0] += 1;
            System.out.print(array3[i] + " ");
        }
    }
}
