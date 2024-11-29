package lesson20.mapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test3 {
  public static void main(String[] args) {
    Map<String, List<String>> countryAndCites = new HashMap<>();

    List<String> az = new ArrayList<>();
    az.add("Baku");
    az.add("Sumqayit");
    az.add("Naxchvan");

    List<String> tr = new LinkedList<>();
    tr.add("Ankara");
    tr.add("Istanbul");
    tr.add("Izmir");

    countryAndCites.put("AZ", az);
    countryAndCites.put("TR", tr);

    System.out.println(az);
    System.out.println(tr);

    System.out.println(countryAndCites);

    countryAndCites.forEach((whatEverYouWant, whatEverYouNeed) ->
        System.out.println(whatEverYouWant + " -> " + whatEverYouNeed));
  }
}
