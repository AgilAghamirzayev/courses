package lesson22.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
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

    Set<String> sorted = names.stream()
        .collect(Collectors.toCollection(TreeSet::new));

    System.out.println(names);
    System.out.println(sorted);
  }
}
