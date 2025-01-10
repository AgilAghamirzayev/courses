package az.texnoera.l34userms.singleton;

public class Main {
  public static void main(String[] args) {
    Book book = Book.getInstance();
    Book book1 = Book.getInstance();

    System.out.println(book);
    System.out.println(book1);
  }
}
