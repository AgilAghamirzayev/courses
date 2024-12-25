package lesson27.part0;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
  private final int value;
  public final List<String> values;

  public ImmutableClass(int value, List<String> values) {
    this.value = value;
    this.values = values;
  }

  public int getValue() {
    return value;
  }

  public List<String> getValues() {
    return new ArrayList<>(values);
  }

  @Override
  public String toString() {
    return "ImmutableClass{" +
        "value=" + value +
        ", values=" + values +
        '}';
  }
}


class Main {
  public static void main(String[] args) {
    ArrayList<String> objects = new ArrayList<>();
    objects.add("Hello");

    ImmutableClass a = new ImmutableClass(5, objects);
    System.out.println(a);

    a.getValues().add("Bye");

    System.out.println(a);
  }
}