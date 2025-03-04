package lesson09.practice;

public class Employee extends Worker {

  private static int employeeNo = 1;
  private long employeeId;
  private String hireDate;

  public Employee(String name, String birthDate, String hireDate) {
    super(name, birthDate);
    this.employeeId = Employee.employeeNo++;
    this.hireDate = hireDate;
  }

  @Override
  public String toString() {
    return "Employee{" + "employeeId=" + employeeId + ", hireDate='" + hireDate + '\'' + "} " + super.toString();
  }

}
