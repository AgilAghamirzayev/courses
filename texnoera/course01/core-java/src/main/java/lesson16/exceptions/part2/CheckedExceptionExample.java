package lesson16.exceptions.part2;

import java.io.*;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("file.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found! Please check the file path.");
        } catch (IOException e) {
            System.out.println("Error reading the file!");
        }
    }
}