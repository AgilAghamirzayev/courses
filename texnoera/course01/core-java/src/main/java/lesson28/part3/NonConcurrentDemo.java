package lesson28.part3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class NonConcurrentDemo {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new CopyOnWriteArrayList<>();
        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();

        StringBuilder sb = new StringBuilder();
        sb.append("");
        Thread writerThread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                list.add(i);
                System.out.println("Added: " + i);
            }
        });

        Thread readerThread = new Thread(() -> {
                for (Integer number : list) {
                  try {
                    Thread.sleep(111);
                  } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                  }
                  System.out.println("Read: " + number);
                }

        });

        writerThread.start();
        readerThread.start();

        writerThread.join();
        readerThread.join();
    }
}