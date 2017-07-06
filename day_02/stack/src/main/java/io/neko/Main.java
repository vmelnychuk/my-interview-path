package io.neko;

public class Main {
    public static void main(String[] args) {
        FixedCapacityStack stack = new FixedCapacityStack(10);
        String input = "1 2 3 4";
        String[] inputArray = input.split(" ");
        for (String string : inputArray) {
            stack.push(Integer.valueOf(string));
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
