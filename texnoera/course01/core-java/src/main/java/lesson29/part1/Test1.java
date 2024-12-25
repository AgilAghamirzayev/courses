package lesson29.part1;

public class Test1 {



  public static void main(String[] args) {
    Person ali = new Person("Ali", 11);
    Person vali = new Person();

    System.out.println(getPersonName(ali));
    System.out.println(getPersonName(vali));
  }


  public static String getPersonName(Person person) {

    if (person != null) {
      if (person.getName() != null) {
        return person.getName().toUpperCase();
      }
    }

    return "";
  }


}
