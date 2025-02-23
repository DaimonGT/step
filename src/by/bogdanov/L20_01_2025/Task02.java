package by.bogdanov.L20_01_2025;

import by.bogdanov.utils.ArrayUtil;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        searh();
    }
    private static void searh() {
        long[] array = ArrayUtil.generateIntArray(10000000, 375290000000L, 375300000000L);
        Arrays.sort(array);
        System.out.println(Arrays.binarySearch(array, 375296063747L));
        System.out.println(array[Arrays.binarySearch(array, 375296063747L)]);

    }
}
