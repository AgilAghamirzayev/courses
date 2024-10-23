package lesson08.inclass;

public class Test {
  public static void main(String[] args) {
    Person person = new Person();
    person.adiDaxilEt("Ali");
    person.yasiDaxilEt(11);
    person.introduce();

    int yas = person.yasiGetir();
    System.out.println("YAS: " + yas);

    String ad = person.adiGetir();
    System.out.println("AD: " + ad);

  }

}
