package lesson26;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test4 {
  public static void main(String[] args) {

    List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//    Stream<Integer> nums1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Stream<Integer> nums1 = nums.stream();

    nums.stream()
        .map(i -> i + 5)
        .forEach(System.out::println);

    nums.stream()
        .map(i -> i + 5)
        .forEach(System.out::println);

    int[] nums2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    IntSummaryStatistics intSummaryStatistics = Arrays.stream(nums2)
        .summaryStatistics();

    System.out.println(intSummaryStatistics);

    int sum = Arrays.stream(nums2).sum();
    System.out.println(sum);
  }
}
