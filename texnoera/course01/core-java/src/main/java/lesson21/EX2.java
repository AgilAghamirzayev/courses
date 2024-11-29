package lesson21;

import java.util.HashMap;
import java.util.Map;

public class EX2 {

  public static void main(String[] args) {
    charCount("ABBBAABCCD");
  }


  public static void charCount(String sentence) {
    Map<Character, Integer> charAndCount = new HashMap<>();

    for (char c : sentence.toCharArray()) {
      if (charAndCount.containsKey(c)) {
        Integer count = charAndCount.get(c);
        charAndCount.put(c, ++count);
      } else {
        charAndCount.put(c, 1);
      }
    }

    System.out.println(charAndCount);
  }

}
