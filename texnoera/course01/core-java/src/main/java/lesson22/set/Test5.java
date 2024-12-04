package lesson22.set;

import java.util.Set;
import java.util.TreeSet;

public class Test5 {
  public static void main(String[] args) {
    Set<String> names = new TreeSet<>();
    names.add("C");
    names.add("F");
    names.add("C");
    names.add("C");
    names.add("D");
    names.add("Z");
    names.add("A");
    names.add("L");

    System.out.println(names);
  }
}
