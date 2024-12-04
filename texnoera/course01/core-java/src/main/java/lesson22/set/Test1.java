package lesson22.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test1 {
  public static void main(String[] args) {

    HashSet<String> names = new HashSet<>();
    boolean ali = names.add("Ali");
    System.out.println(ali);
    System.out.println(names);

    HashMap<String, String> map = new HashMap<>();
    Object put = map.put("name", "Ali");
    System.out.println("put -> " + put);
    System.out.println(map);
    Object put1 = map.put("name", "Vali");
    System.out.println("put2 -> " + put1);
    System.out.println(map);

    boolean ali1 = names.add("Ali");
    System.out.println(ali1);
    System.out.println(names);

  }
}
