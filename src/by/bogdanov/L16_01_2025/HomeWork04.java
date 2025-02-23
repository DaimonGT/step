package by.bogdanov.L16_01_2025;

public class HomeWork04 {
    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int k = 17;
        boolean thereIs = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] + arr[j] == k) {
                    thereIs = true;
                    break;
                } else {
                    thereIs = false;
                }
            }
        }
        System.out.println(thereIs ? "Да" : "Нет");
    }
}
