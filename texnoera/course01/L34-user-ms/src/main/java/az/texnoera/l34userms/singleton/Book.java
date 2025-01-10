package az.texnoera.l34userms.singleton;

public class Book {

  private final static Book instance = new Book();

  private Book() {
  }

  public static Book getInstance() {
    return instance;
  }

}
