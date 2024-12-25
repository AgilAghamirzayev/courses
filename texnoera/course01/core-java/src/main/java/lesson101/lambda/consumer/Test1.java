package lesson101.lambda.consumer;

public class Test1 {
  public static void main(String[] args) {

    Consumer<String> printer1 = new Consumer<String>() {
      @Override
      public void accept(String message) {
        System.out.println("Printing " + message);
      }
    };

    printer1.accept("Hello, Consumer!");

    Consumer<String> printer2 = (String message) -> {
      System.out.println("Printing: " + message);
    };
    printer2.accept("Hello, Consumer!");


    // Lambda expression example
    Consumer<String> printer3 = message -> System.out.println("Printing: " + message);
    printer3.accept("Hello, Consumer!");


    Consumer<String> printer4 = (String message) -> {
      System.out.println("Printing: " + message);
      System.out.println("Printing in uppercase: " + message.toUpperCase());
      System.out.println("Message length: " + message.length());
    };

    printer4.accept("Hello, Consumer!");

  }
}



