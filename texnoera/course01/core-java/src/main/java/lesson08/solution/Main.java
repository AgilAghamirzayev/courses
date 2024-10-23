package lesson08.solution;

public class Main {
  public static void main(String[] args) {
    Pet dog = new Pet("dog", "Rock", 5, 75, new String[] {"eat", "drink", "sleep"});

    Human mother = new Human("Jane", "Karleone", 1950);
    Human father = new Human("Vito", "Karleone", 1945);

    Human child = new Human("Michael", "Karleone", 1977, 90, dog, father, mother,
        new String[][] {
            {"Monday", "Go to school"},
            {"Tuesday", "Do homework"},
            {"Wednesday", "Play football"},
        });


    System.out.println(child);
    child.greetPet();
    child.describePet();

    boolean isTimeForFeeding = true;
    child.feedPet(isTimeForFeeding);
  }
}