package lesson08.solution;

import java.util.Arrays;
import java.util.Random;

public class Human {
    String name;
    String surname;
    int birthYear;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    public Human() {}

    public Human(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public Human(String name, String surname, int birthYear, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int birthYear, int iq, Pet pet, Human father, Human mother, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.iq = iq;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;
    }

    // Methods
    public void greetPet() {
        System.out.println("Hello, " + pet.nickname);
    }

    public void describePet() {
        String slyLevel = (pet.trickLevel > 50) ? "very sly" : "almost not sly";
        System.out.println("I have a " + pet.species + ", he is " + pet.age + " years old, he is " + slyLevel);
    }

    public boolean feedPet(boolean isTimeForFeeding) {
        if (isTimeForFeeding) {
            System.out.println("Hm... I will feed " + name + "'s " + pet.species);
            return true;
        } else {
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            if (pet.trickLevel > randomNumber) {
                System.out.println("Hm... I will feed " + name + "'s " + pet.species);
                return true;
            } else {
                System.out.println("I think " + pet.nickname + " is not hungry.");
                return false;
            }
        }
    }

    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + birthYear + ", iq=" + iq +
                ", mother=" + (mother != null ? mother.name + " " + mother.surname : "unknown") +
                ", father=" + (father != null ? father.name + " " + father.surname : "unknown") +
                ", pet=" + (pet != null ? pet.toString() : "no pet") + "}";
    }

}