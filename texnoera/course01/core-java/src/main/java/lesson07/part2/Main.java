package lesson07.part2;

public class Main {
  public static void main(String[] args) {
    Department department1 = new Department();
    department1.name = "Software Engineering";

    Professor professor1 = new Professor();
    professor1.name = "Ali Aliyev";

    Course course1 = new Course();
    course1.code = "CSE101";
    course1.name = "Computer Science Introduction";

    Student student1 = new Student();
    student1.name = "Lale Aliyeva";

    // Head of Software Engineering department is Ali Aliyev
    department1.head = professor1;
    professor1.department = department1;

    // Software engineering department has 100 courses and CSE101 course belongs to Software Engineering department
    course1.department = department1;
    department1.courses = new Course[100];
    department1.courses[0] = course1;

    course1.teacher = professor1;
    professor1.coursesTaught = new Course[5];
    professor1.coursesTaught[0] = course1;

    professor1.advisee = new Student[10];
    professor1.advisee[0] = student1;
    student1.advisor = professor1;

    student1.courses = new Course[8];
    student1.courses[0] = course1;

    course1.students = new Student[100];
    course1.students[0] = student1;

    System.out.println("Name of student student1's first course is: " + student1.courses[0].name);
    System.out.println("Name of student student1's first course's professor is: " + student1.courses[0].teacher.name);
    System.out.println("Name of student student1's first course's professor's department is: " + student1.courses[0].teacher.department.name);

  }
}
