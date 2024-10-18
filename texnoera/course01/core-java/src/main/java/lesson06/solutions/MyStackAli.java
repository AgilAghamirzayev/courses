package lesson06.solutions;

public class MyStackAli {
    public static final int MAX_STACK_SIZE = 10;
    String[] array = new String[MAX_STACK_SIZE];
    int pointer = 0;
    public void push(String newElement) {
        array[pointer++] = newElement;
    }
    public String pop() {
        String result = array[pointer - 1];
        array[--pointer] = null;
        return result;
    }
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }
    public boolean isEmpty() {
        for (int i = 0; i < pointer; i++) {
            if (array[i] == null) {
                return true;
            }
        }
        return false;
    }
    public boolean isFull() {
        for (int i = 0; i < MAX_STACK_SIZE; i++) {
            if (array[i] == null) {
                return false;
            }
        }
        return true;
    }
    public int size() {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                result++;
            }
        }
        return result;
    }
    public int getCapacity() {
        return MAX_STACK_SIZE;
    }
    public void showElements() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}