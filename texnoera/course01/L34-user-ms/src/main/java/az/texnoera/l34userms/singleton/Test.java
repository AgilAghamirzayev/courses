package az.texnoera.l34userms.singleton;

public class Test {
  public static void main(String[] args) {
//    Person1 p2 = Person1.of("John", "John", 10, "a@gmail.com");

    var p1 =Person1.builder()
        .name("Ali")
        .lastName("Aliyev")
        .build();

    Person1 build = Person1.builder()
        .name("Ali")
        .lastName("Aliyev")
        .email("aliyev@gmail.com")
        .age(11)
        .build();


  }
}
