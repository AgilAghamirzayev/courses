package lesson33.injection;


import java.util.List;
import lesson33.commons.bls.EmployeeSalaryCalculator;
import lesson33.commons.dao.EmployeeDao;
import lesson33.commons.ds.Employee;
import lesson33.commons.ds.EmployeeSalary;
import lesson33.commons.report.SalaryReport;

class EmployeesSalariesReportService {
//    @Autowired
    private final EmployeeDao employeeDao;
    private final EmployeeSalaryCalculator employeeSalaryCalculator;
    private final SalaryReport salaryReport;

    EmployeesSalariesReportService(EmployeeDao employeeDao,
                                   EmployeeSalaryCalculator employeeSalaryCalculator,
                                   SalaryReport salaryReport) {
        this.employeeDao = employeeDao;
        this.employeeSalaryCalculator = employeeSalaryCalculator;
        this.salaryReport = salaryReport;
    }

    void generateReport() {
        List<Employee> employees = employeeDao.findAll();
        List<EmployeeSalary> employeeSalaries = employeeSalaryCalculator.calculateSalaries(employees);

        salaryReport.writeReport(employeeSalaries);
    }
}
