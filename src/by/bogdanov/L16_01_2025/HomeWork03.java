package by.bogdanov.L16_01_2025;

import java.util.ArrayList;

public class HomeWork03 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int k = 6;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + arr[i + 1] == k) {
                count += 1;
                i++;
            }
            if (i == arr.length - 2 && arr[arr.length - 1] + arr[0] == k) {
                count += 1;
            }
        }
        System.out.println(count + " пары");
    }
}

