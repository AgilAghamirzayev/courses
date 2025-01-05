package lesson33.commons.dao;


import java.util.Collections;
import java.util.List;
import lesson33.commons.ds.Employee;

public class EmployeeDao {
    public List<Employee> findAll() {
        System.out.println("Finding all employees");
        return Collections.emptyList();
    }
}
