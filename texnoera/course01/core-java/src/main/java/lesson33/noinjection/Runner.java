package lesson33.noinjection;


public class Runner {
    public static void main(String... args) {
        EmployeesSalariesReportService employeesSalariesReportService = new EmployeesSalariesReportService();

        employeesSalariesReportService.generateReport();
    }
}
