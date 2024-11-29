package lesson20.mapp;

import java.util.HashMap;
import java.util.Map;

public class Test {
  public static void main(String[] args) {
    Map<String, String> countyAndCapital = new HashMap<>();
    countyAndCapital.put("AZ", "Baku");
    countyAndCapital.put("TR", "Ankara");
    countyAndCapital.put("CA", "Sacramento");
    String baku = countyAndCapital.get("AZ");
    System.out.println(baku);

    System.out.println(countyAndCapital);


    countyAndCapital.put("TR", "Istanbul");
    System.out.println(countyAndCapital);

    countyAndCapital.put("COX", "Baku");
    System.out.println(countyAndCapital);

    countyAndCapital.replace("CA", "Baku");

    if (!countyAndCapital.containsKey("AZ")) {
      countyAndCapital.put("AZ", "Test");
    } else {
      System.out.println("County AZ already exists");
    }

    countyAndCapital.putIfAbsent("AZ", "Test");
    countyAndCapital.putIfAbsent("Test", "Test");

    System.out.println(countyAndCapital);

    countyAndCapital.remove("AZ");

    System.out.println(countyAndCapital);

  }
}
