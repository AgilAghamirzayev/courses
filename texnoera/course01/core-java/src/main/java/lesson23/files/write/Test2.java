package lesson23.files.write;

import java.io.File;

public class Test2 {
  public static void main(String[] args) {

    File file = new File("z");
    for (int i = 0; i < 10; i++) {
      String absolutePath = file.getAbsolutePath();
      File file1 = new File(absolutePath + "z");
      file1.mkdir();
    }

  }

  private static boolean createDirectory(File file) {
    if (!file.exists()) {
      return file.mkdir();
    }
    return false;
  }
}
