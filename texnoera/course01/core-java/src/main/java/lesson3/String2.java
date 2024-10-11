package lesson3;

public class String2 {


  public static void main(String[] args) {
    String s1 = "     Hello          World       ";
    String trim = s1.trim();

    System.out.println(trim);

    String s = s1.trim().substring(0, 5) + " " + s1.trim().substring(9, 14);
    System.out.println(s);

    String s3 = s1.replaceAll("\\s+", " ").trim();
    System.out.println(s3);

//    char c = s2.charAt(0);
//    System.out.println(c);

    String upperCase = s1.toUpperCase();
    System.out.println(upperCase);
    System.out.println(s1);

    String lowerCase = s1.toLowerCase();
    System.out.println(lowerCase);
    System.out.println(s1);

    System.out.println(s3);
    boolean b = s3.startsWith("Hell");
    System.out.println(b);


    String username = "   ";

    System.out.println(username);
    System.out.println(username.isEmpty()); //
    System.out.println(username.isBlank()); //

    if (username.isBlank()) {
      System.out.println("Username cannot be empty or only whitespace.");
    }

  }

}
