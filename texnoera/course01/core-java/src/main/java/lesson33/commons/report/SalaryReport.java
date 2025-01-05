package lesson33.commons.report;


import java.util.List;
import lesson33.commons.ds.EmployeeSalary;

public interface SalaryReport {
    void writeReport(List<EmployeeSalary> employeeSalaries);
}
