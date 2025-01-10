package az.texnoera.l34userms.singleton;

public class Book3 {

  private volatile static Book3 instance;

  private Book3() {
  }

  public static Book3 getInstance() {
    if (instance == null) {
      synchronized (Book3.class) {
        if (instance == null) {
          instance = new Book3();
        }
      }
    }
    return instance;
  }

}
