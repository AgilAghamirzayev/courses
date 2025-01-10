package az.texnoera.l34userms.singleton;

public class Book1 {

  private static Book1 instance;

  private Book1() {
  }

  public static Book1 getInstance() {
    if (instance == null) {
      instance = new Book1();
    }
    return instance;
  }

}
