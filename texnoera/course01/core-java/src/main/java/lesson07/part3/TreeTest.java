package lesson07.part3;

public class TreeTest {
  public static void main(String[] args) {
    Tree tree = new Tree("Pine", 12.4f); // 11
    tree.printInfo();

    Tree copiedTree = tree.copy(); // 12
    copiedTree.printInfo();
    System.out.println();

    if (tree == copiedTree) {
      System.out.println("Both trees are the same instance.");
    } else {
      System.out.println("Both trees are different instances.");
    }

    tree.grow().grow().grow().printInfo();

    Tree growTree = tree.grow(); // 11
    growTree.printInfo();

    if (tree == growTree) {
      System.out.println("Both trees are the same instance after growing.");
    } else {
      System.out.println("Both trees are different instances after growing.");
    }

  }
}
