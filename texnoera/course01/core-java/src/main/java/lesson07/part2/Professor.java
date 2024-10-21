package lesson07.part2;

import java.time.LocalDateTime;

public class Professor {
  public String id;
  public String name;
  public String email;
  public LocalDateTime birthDate;
  public Department department;
  public Student[] advisee;
  public Course[] coursesTaught;
}
