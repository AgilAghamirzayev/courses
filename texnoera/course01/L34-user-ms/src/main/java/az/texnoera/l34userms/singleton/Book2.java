package az.texnoera.l34userms.singleton;

public class Book2 {

  private volatile static Book2 instance;

  private Book2() {
  }

  public synchronized static Book2 getInstance() {
    if (instance == null) {
      instance = new Book2();
    }
    return instance;
  }

}
