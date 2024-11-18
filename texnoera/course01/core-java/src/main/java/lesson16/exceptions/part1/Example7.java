package lesson16.exceptions.part1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Example7 {

  private static final Logger logger = Logger.getLogger(Example7.class.getName());

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();
    operateString(input);
  }

  private static void operateString(String input) {
    try {
      input = input.toUpperCase();
      logger.info(input);
      input = input.substring(1, 10);
      logger.info(input);
    } catch (NullPointerException ex) {
      logger.severe("An null pointer exception occurred. Please check your data");
    } catch (StringIndexOutOfBoundsException ex) {
      logger.severe("StringIndexOutOfBoundsException exception occurred. Please check your input data");
    } catch (Exception ex) {
      logger.severe("An exception occurred. Please check your program");
    }
  }

}