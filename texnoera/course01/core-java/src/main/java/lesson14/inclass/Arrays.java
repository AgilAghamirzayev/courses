package lesson14.inclass;

public class Arrays {
  public static void main(String[] args) {
    String[] s = new String[]{"a", "b", "c", "d", "e",};

    String[] strings = java.util.Arrays.copyOf(s, 10);

    System.out.println(java.util.Arrays.deepToString(s));
    System.out.println(java.util.Arrays.toString(strings));

    strings[0] = "f";

    System.out.println(java.util.Arrays.deepToString(s));
    System.out.println(java.util.Arrays.toString(strings));

  }
}
