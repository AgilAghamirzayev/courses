package lesson21;

public class EX1 {
  public static void main(String[] args) {
    charCount("AAABBBBCCD");
  }

  public static void charCount(String sentence) {
    int[] count = new int[256];

    for (char c : sentence.toCharArray()) {
      count[c]++;
    }

    for (int i = 0; i < count.length; i++) {
      if (count[i] > 0) {
        System.out.printf("%c: %d%n", (char) i, count[i]);
      }
    }
  }

}
