package lesson21;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EX4 {

  public static void main(String[] args) {
    System.out.println(charCount("ABBBAABCCD"));
  }

  public static Map<Character, Long> charCount(String sentence) {
    return sentence.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(Function.identity(),
            Collectors.counting()));
  }

}
