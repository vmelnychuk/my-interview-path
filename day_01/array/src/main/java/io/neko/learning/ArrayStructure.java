package io.neko.learning;

import java.util.Arrays;
import java.util.Random;

public class ArrayStructure {
    public static final int MAX_SIZE = 50;

    private int[] array = new int[MAX_SIZE];
    private int filledSize;

    public ArrayStructure() {
        this.filledSize = 10;
        Random generator = new Random();
        for (int i = 0; i < filledSize; i++) {
            int value = generator.nextInt(11) + 10;
            this.array[i] = value;
        }
    }

    public int[] getArray() {
        return Arrays.copyOf(array, filledSize);
    }

    public int getFilledSize() {
        return filledSize;
    }

    public void insertValue(int value) {
        if (filledSize <= MAX_SIZE) {
            array[filledSize] = value;
            filledSize++;
        }
    }

    public void deleteIndex(int index) {
        for (int i = index; i < filledSize; i++) {
            array[i] = array[i + 1];
        }
        filledSize--;
    }
}
