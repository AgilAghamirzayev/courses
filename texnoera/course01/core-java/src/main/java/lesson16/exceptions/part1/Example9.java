package lesson16.exceptions.part1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Example9 {

  private static final Logger logger = Logger.getLogger(Example9.class.getName());

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();
    operateString(input);
  }

  private static void operateString(String input) throws Exception {
    try {
      input = input.toUpperCase();
      logger.info(input);
      input = input.substring(1, 10);
      logger.info(input);
    } catch (NullPointerException ex) {
      logger.severe("An null pointer exception occurred. Please check your data");
    } catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException ex) {
      logger.severe("IndexOutOfBoundsException exception occurred. Please check your input data");
    } catch (Exception ex) {
      logger.severe("An exception occurred. Please check your program");
    }
  }

}