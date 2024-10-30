package lesson11.objectclass;

public class Test1 {
  public static void main(String[] args) throws CloneNotSupportedException {

    Person p1 = new Person("Ali", 11);

    Object clone = p1.clone();

    System.out.println(clone);
    System.out.println(p1);


  }
}
