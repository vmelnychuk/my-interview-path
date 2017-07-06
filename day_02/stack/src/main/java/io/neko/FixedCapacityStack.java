package io.neko;

public class FixedCapacityStack<Item> {
    private Item[] array;
    private int size;
    public FixedCapacityStack(int capacity) {
        this.array = (Item[]) new Object[capacity];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(Item item) {
        this.array[size++] = item;
    }

    public Item pop() {
        return this.array[--size];
    }
}
