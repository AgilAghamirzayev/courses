package lesson18.hw06;

public class Main {
  public static void main(String[] args) {

    Human father = new Human("Ali", "Aliyev", 1999, 118, 3, "Going to work");
    Human mother = new Human("Aysu", "Aliyeva", 2001, 117, 7, "Have a rest");
    Family family = new Family(mother, father);
    Pet pet = new Pet(Species.CAT, "Less", 3, 78, new String[] {"eat", "sleep", "play"});
    Human child1 = new Human("Vali", "Aliyev", 1999, 100, 4, "Go to course");
    Human child2 = new Human("Ayla", "Aliyeva", 1999, 100, 4, "Go to course");

    System.out.println(mother);
    System.out.println(father);
    family.addChild(child1);
    family.addChild(child2);

    family.addPet(pet);
    family.showChild();
    System.out.println(family);

    family.deleteChild(child2);
    System.out.println(family.showChild());

    family.eat();
    family.respond();
    family.foul();

    Pet pet1 = new Pet(Species.CAT, "Less", 3, 78, new String[] {"eat", "sleep", "play"});
    Pet pet2 = new Pet(Species.CAT, "Less", 3, 78, new String[] {"eat", "sleep", "play"});

    if (pet1.equals(pet2)) {
      System.out.println("They are same");
    } else {
      System.out.println("They are different");
    }

  }
}
