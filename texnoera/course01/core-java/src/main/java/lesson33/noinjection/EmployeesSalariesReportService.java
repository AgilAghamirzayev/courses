package lesson33.noinjection;


import java.util.List;
import lesson33.commons.bls.EmployeeSalaryCalculator;
import lesson33.commons.dao.EmployeeDao;
import lesson33.commons.ds.Employee;
import lesson33.commons.ds.EmployeeSalary;
import lesson33.commons.report.PdfSalaryReport;

class EmployeesSalariesReportService {
  void generateReport() {
    EmployeeDao employeeDao = new EmployeeDao();
    List<Employee> employees = employeeDao.findAll();

    EmployeeSalaryCalculator employeeSalaryCalculator = new EmployeeSalaryCalculator();
    List<EmployeeSalary> employeeSalaries = employeeSalaryCalculator.calculateSalaries(employees);

    PdfSalaryReport pdfSalaryReport = new PdfSalaryReport();
    pdfSalaryReport.writeReport(employeeSalaries);
  }
}
