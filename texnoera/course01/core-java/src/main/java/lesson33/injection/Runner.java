package lesson33.injection;

import lesson33.commons.bls.EmployeeSalaryCalculator;
import lesson33.commons.dao.EmployeeDao;
import lesson33.commons.report.PdfSalaryReport;

public class Runner {
    public static void main(String... args) {
        EmployeesSalariesReportService employeesSalariesReportService = new EmployeesSalariesReportService(
                new EmployeeDao(),
                new EmployeeSalaryCalculator(),
                new PdfSalaryReport()
        );

        employeesSalariesReportService.generateReport();
    }
}
