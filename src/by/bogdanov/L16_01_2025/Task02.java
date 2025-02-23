package by.bogdanov.L16_01_2025;

public class Task02 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 10, 1, 10};
        int num = 0;
        int num1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = num1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    num++;
                }
                num1++;
            }
            System.out.println(arr[i] + " " + num);
        }
    }
}
