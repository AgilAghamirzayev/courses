package lesson33.commons.report;

import java.util.List;
import lesson33.commons.ds.EmployeeSalary;


public class XlsSalaryReport implements SalaryReport {
    public void writeReport(List<EmployeeSalary> employeeSalaries) {
        System.out.println("Writing Xls Report");
    }
}
