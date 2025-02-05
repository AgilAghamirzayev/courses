package az.ders.l41jpa.repo;

import az.ders.l41jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends
    JpaRepository<Employee, Long> {

}