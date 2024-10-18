package lesson06.solutions;

public class MyStackRufat {
    public static int MAX_STACK_SIZE = 10;
    String[] array = new String[MAX_STACK_SIZE];
    public int pointer = 0;
    public boolean empty;
    public int caapacity;
    public boolean full;

    public void push(String newElement) {
        array[pointer++] = newElement;
    }

    public String pop() {
        String lastElement = array[pointer-1];
        array[--pointer] = null;

        return lastElement;
    }

    public void clear() {
        for (int i = 0; i <= pointer; i++) {
            array[i] = null;
        }
        pointer = 0;
        System.out.println("Stack tam temizlendi");
    }

    public boolean isEmpty() {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null){
                empty = true;
            }else {
                empty = false;
            }
        }
        if(empty == true){
            System.out.println(array.length - pointer + " eded" + " bos yer var");
        }
        else {
            System.out.println("DOLUDUR");
        }
        return empty;
    }

    public boolean isFull() {
        return false;
    }

    public int size() {
        return 0;
    }

    public int getCapacity() {
        return MAX_STACK_SIZE;
    }

    public void showElements() {
        for (int i = 0; i < pointer; i++) {
            System.out.print(array[i] + ", ");
        }
    }

}