package by.bogdanov.L20_01_2025;

import by.bogdanov.utils.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork03 {
    static public void main(String[] args) {
        int[] array = {1, 3, 5};
        int[] array1 = {2, 4, 6};
        int[] array2 = new int[array.length + array1.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        for (int i = 0; i < array1.length; i++) {
            array2[array.length + i] = array1[i];
        }
        Arrays.sort(array2);
       // System.arraycopy(array, 0, array2, 0, array.length);
       // System.arraycopy(array1, 0, array2, array.length, array1.length);
        System.out.println(Arrays.toString(array2));
    }
}
