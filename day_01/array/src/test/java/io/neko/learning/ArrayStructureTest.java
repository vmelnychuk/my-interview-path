package io.neko.learning;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStructureTest {
    @Test
    public void testInsert() throws Exception {
        ArrayStructure arrayStructure = new ArrayStructure();
        int[] array = arrayStructure.getArray();
        int[] expectedResult = ArrayUtils.addElement(array, 10);

        arrayStructure.insertValue(10);

        assertArrayEquals(expectedResult, arrayStructure.getArray());
    }

    @Test
    public void testDelete() throws Exception {
        ArrayStructure arrayStructure = new ArrayStructure();
        int[] expectedArray = arrayStructure.getArray();

        arrayStructure.insertValue(10);
        arrayStructure.deleteIndex(arrayStructure.getFilledSize() -1);

        assertArrayEquals(expectedArray, arrayStructure.getArray());
    }
}