package by.bogdanov.L13_01_2025;
// Создать новый массив без указанного индекса 2 и вывести его
public class Task06 {
    static public void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int indexToRemove = 2;
        for(int i = 0; i < arr.length; i++) {
            if (i != indexToRemove) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
