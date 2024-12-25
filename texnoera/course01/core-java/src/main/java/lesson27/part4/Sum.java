package lesson27.part4;

public class Sum extends Thread {

  private long startIndex;
  private long endIndex;
  private long result;

  public Sum(long startIndex, long endIndex) {
    this.startIndex = startIndex;
    this.endIndex = endIndex;
  }

  @Override
  public void run() {

    for (long i = startIndex; i <= endIndex; i++) {
      for (long j = 0; j < 30; j++) {

      }
      result += i;
    }
  }

  public long getResult() {
    return result;
  }
}
