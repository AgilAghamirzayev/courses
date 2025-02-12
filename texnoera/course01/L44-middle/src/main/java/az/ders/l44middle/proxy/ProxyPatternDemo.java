package az.ders.l44middle.proxy;

public class ProxyPatternDemo {

  public static void main(String[] args) {
    Internet internet = new ProxyInternet();

    try {
      internet.connectTo("example.com");
      internet.connectTo("abc.com");
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }
  }

}