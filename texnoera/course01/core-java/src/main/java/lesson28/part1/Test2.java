package lesson28.part1;

import java.util.concurrent.atomic.AtomicInteger;

public class Test2 {

  volatile int count = 0;
  volatile int a = 1;
  int b = 2;
  int c = 3;
  // cache
  // volatile long - double (64 bit) -> 32 32
  // java memory model ->
  // happens before

  public void increment() {

  }

//  public void decrement() {
//
//    count--;
//
//
//  }

  public int getCount() {
    return count;
  }

}
