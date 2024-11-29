package lesson21;

import java.util.HashMap;
import java.util.Map;

public class EX3 {

  public static void main(String[] args) {
    charCount("ABBBAABCCD");
  }


  public static void charCount(String sentence) {
    Map<Character, Integer> charAndCount = new HashMap<>();

    for (char c : sentence.toCharArray()) {
      charAndCount.put(c, charAndCount.getOrDefault(c, 0) + 1);
    }

    System.out.println(charAndCount);
  }

}
