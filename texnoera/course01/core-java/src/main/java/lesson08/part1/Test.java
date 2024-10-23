package lesson08.part1;

public class Test {
  public static void main(String[] args) {
    StaticClass sc1 = new StaticClass();
    sc1.incrementCount();
    System.out.println(sc1.count);// 2

    StaticClass sc2 = new StaticClass();
    System.out.println(sc2.count); // 1

    StaticClass.incrementCount(); // 3
    System.out.println(StaticClass.count);

//     What will be print? write in slack

  }
}
