package lesson23.files.object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main1 {
  public static void main(String[] args) {
    Person person1 = new Person(1, "Ali");
    Person person2 = new Person(2, "Vali");
    Person person3 = new Person(3, "Aysu");

    try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("people.ser"))) {
      ois.writeObject(person1);
      ois.writeObject(person2);
      ois.writeObject(person3);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Error: " + e.getMessage());
    }

    System.out.println("People saved successfully to people.txt");
  }
}
