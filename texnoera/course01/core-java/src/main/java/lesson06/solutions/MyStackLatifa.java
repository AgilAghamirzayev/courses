package lesson06.solutions;

public class MyStackLatifa {
    public static final int maxStackSize = 10;
    String[] array = new String[maxStackSize];
    int pointer= 0;
    public void push(String item) {
        if(pointer>array.length-1){
            System.out.println("Stack is full");
        }else{
            String elements= "";
            array[pointer]=item;
            elements+=item;
            System.out.print(elements+" ");
            pointer++;
        }


    }

    public String pop() {
        String lastSymbol= array[pointer-1];
        array[pointer-1]=null;
        return lastSymbol!=null? lastSymbol:"Stack is empty";
    }

    public void clear(){
        for(int i=0;i<=pointer;i++){
            array[i]=null;
        }
        System.out.println("Stack is empty");
    }

    public boolean isEmpty(){
       return  array[0]==null?true:false;
    }

    public boolean isFull(){
        return pointer==maxStackSize? true:false;
    }
    public int size(){
        return pointer;
    }
    public int getCapacity(){
        return maxStackSize;
    }
//    *********
    public void showElements(){
        String elements= "";
        for(int i=pointer -1 ;i>=0;i--){
            elements+=array[i]+"\n";
        }
        System.out.println(elements);
    }

}