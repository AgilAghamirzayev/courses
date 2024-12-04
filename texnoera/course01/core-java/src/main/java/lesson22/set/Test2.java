package lesson22.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test2 {
  public static void main(String[] args) {
    HashSet<String> names = new HashSet<>();
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
