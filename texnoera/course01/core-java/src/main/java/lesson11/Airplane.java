package lesson11;

public class Airplane {

  public static void main(String[] input) {
    int time = 9;
    int day = 3;
    String dinner = ++time>= 10 ? day-- <= 2
        ? "Takeout" : "Salad" : "Leftovers";
    System.out.println(dinner);
  }


}