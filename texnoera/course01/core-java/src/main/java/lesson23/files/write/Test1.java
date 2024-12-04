package lesson23.files.write;

import java.io.File;
import java.io.IOException;

public class Test1 {
  public static void main(String[] args) {
    File file = new File("test.txt");
    try {
      boolean newFile = file.createNewFile();
      System.out.println(newFile);
      System.out.println(file.getAbsolutePath());

      boolean delete = file.delete();
      System.out.println(delete);

    } catch (IOException e) {
      System.out.println("Error creating file: " + file.getAbsolutePath());
    }
  }
}
