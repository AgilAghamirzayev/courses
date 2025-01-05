package lesson33.commons.report;

import java.util.List;
import lesson33.commons.ds.EmployeeSalary;

public class PdfSalaryReport implements SalaryReport {
    public void writeReport(List<EmployeeSalary> employeeSalaries) {
        System.out.println("Writing Pdf Report");
    }
}
