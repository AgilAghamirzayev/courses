package az.ders.l44middle.config;

import java.util.HashMap;

class Solution {

  public static void main(String[] args) {
    System.out.println(isIsomorphic("paper", "title"));
  }

  public static boolean isIsomorphic(String s, String t) {
    HashMap<Character, Character> a = new HashMap<>();

    if (s.length() != t.length()) {
      return false;
    }

    for (int i = 0; i < s.length(); i++) {
      if (a.containsKey(s.charAt(i))) {
        if (a.get(s.charAt(i)) != t.charAt(i)) {
          return false;
        }
      } else {
        if (a.containsKey(t.charAt(i))) {
          if (a.get(t.charAt(i)) != s.charAt(i)) {
            return false;
          }
        } else {
          a.put(s.charAt(i), t.charAt(i));
        }
      }

    }

    return true;
  }
}