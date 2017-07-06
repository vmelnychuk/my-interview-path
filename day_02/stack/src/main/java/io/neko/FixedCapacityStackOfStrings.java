package io.neko;

public class FixedCapacityStackOfStrings {
    private String[] array;
    private int size;

    public FixedCapacityStackOfStrings(int size) {
        this.array = new String[size];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(String string) {
        array[size] = string;
        size++;
    }

    public String pop() {
        return array[--size];
    }
}
