package lesson07.part3;

public class Tree {
  public String type;
  public float height;

  public Tree(String type, float height) {
    this.type = type;
    this.height = height;
  }

  public Tree copy() {
    Tree copyTree = new Tree(type, height); // 12
    return copyTree; // 12
  }

  public Tree grow() {
    height++;
    return this; //11
  }

  public void printInfo() {
    System.out.println("Tree type: " + type);
    System.out.println("Tree height: " + height + " meters");
  }

}
