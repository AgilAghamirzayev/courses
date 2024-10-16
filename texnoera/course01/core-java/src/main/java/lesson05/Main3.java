package lesson05;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();

        int[] count = new int[128];

        for (char c : text.toCharArray()) {
            count[c]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + " -> " + count[i]);
            }
        }


    }
}