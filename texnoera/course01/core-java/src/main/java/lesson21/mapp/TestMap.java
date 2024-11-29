package lesson21.mapp;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

  public static void main(String[] args) {
    /**
     * HashMap       -> accept null and not thread safe and not order O(1) insert, O(1) delete, O(1) get
     * HashTable     -> not accept null and thread safe and not order
     * LinkedHashMap -> accept null and not thread safe and insertion order
     * TreeMap       -> not accept null and not thread safe and key sorted order O(logN)
     */

    Hashtable<String, String> hashMap = new Hashtable<>();
//    hashMap.put(null, "One");
//    hashMap.put("Test", null);
    hashMap.put("Loan", "Two");
    hashMap.put("Cash", "Three");
    System.out.println(hashMap);

    LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
    linkedHashMap.put(null, "One");
    linkedHashMap.put("Test", null);
    linkedHashMap.put("Loan", "Two");
    linkedHashMap.put("Cash", "Three");
    System.out.println(linkedHashMap);

    TreeMap<String, String> treeMap = new TreeMap<>();
//    treeMap.put(null, "One");
//    treeMap.put("Test", null);
    treeMap.put("Test", "One");
    treeMap.put("Loan", "Two");
    treeMap.put("Cash", "Three");
    System.out.println(treeMap);

    TreeMap<Person, String> treeMap1 = new TreeMap<>();
    treeMap1.put(new Person("Z"), "One");
    treeMap1.put(new Person("V"), "Two");
    treeMap1.put(new Person("F"), "Three");
    System.out.println(treeMap1);
  }

}
