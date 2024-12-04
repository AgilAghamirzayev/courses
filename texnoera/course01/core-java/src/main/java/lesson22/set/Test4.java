package lesson22.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Test4 {
  public static void main(String[] args) {
    Set<String> names = new LinkedHashSet<>();
    names.add("C");
    names.add("F");
    names.add("C");
    names.add("C");
    names.add("D");
    names.add("Z");
    names.add("A");
    names.add("L");

    Set<String> sorted = new TreeSet<>(names);

    System.out.println(names);
    System.out.println(sorted);
  }
}
