package lesson01;

public class WhileV2OptimizedWay {

  public static void main(String[] args) {

    int eded = 7;
    while(eded <= 90) {
      if(eded % 7 == 0) {
        System.out.println(eded);
      }
      eded++;
    }
    
  }

}
