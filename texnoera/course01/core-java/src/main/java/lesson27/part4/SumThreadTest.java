package lesson27.part4;

import java.util.ArrayList;
import java.util.List;

public class SumThreadTest {

    public static void main(String[] args) throws InterruptedException {
      long startTime = System.currentTimeMillis();
//        int numberOfCores = Runtime.getRuntime().availableProcessors(); // Get the number of CPU cores
        int numberOfCores = 100; // Get the number of CPU cores
        System.out.println("Number of CPU Cores: " + numberOfCores);

        long rangeStart = 1;
        long rangeEnd = 1_000_000_000L; // Example range for the sum
        long rangePerThread = (rangeEnd - rangeStart + 1) / numberOfCores;

        List<Sum> threads = new ArrayList<>();
        long start = rangeStart;

        // Create threads based on the number of CPU cores
        for (int i = 0; i < numberOfCores; i++) {
            long end = (i == numberOfCores - 1) ? rangeEnd : (start + rangePerThread - 1);
            Sum thread = new Sum(start, end);
            threads.add(thread);
            start = end + 1;
        }

        // Start all threads
        for (Sum thread : threads) {
            thread.start();
        }

        // Wait for all threads to complete
        for (Sum thread : threads) {
            thread.join();
        }

        // Combine the results
        long totalSum = 0;
        for (Sum thread : threads) {
            totalSum += thread.getResult();
        }

        System.out.println("Total Sum: " + totalSum);
      long endTime = System.currentTimeMillis();
      System.out.println("Total Time: " + (endTime - startTime));

    }
}