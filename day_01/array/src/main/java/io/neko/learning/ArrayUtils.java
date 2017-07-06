package io.neko.learning;

import java.util.Arrays;

public class ArrayUtils {
    public static int[] addElement(int[] array, int element) {
        int[] result = Arrays.copyOf(array, array.length + 1);
        result[array.length] = element;
        return result;
    }
}
