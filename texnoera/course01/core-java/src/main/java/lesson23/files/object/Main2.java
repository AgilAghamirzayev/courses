package lesson23.files.object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main2 {
  public static void main(String[] args) {

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.ser"))) {
      System.out.println(ois.readObject());
      System.out.println(ois.readObject());
      System.out.println(ois.readObject());

    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Error: " + e.getMessage());
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }

    System.out.println("People saved successfully to people.txt");
  }
}
