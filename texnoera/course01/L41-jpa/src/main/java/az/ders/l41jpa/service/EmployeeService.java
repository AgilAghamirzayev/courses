package az.ders.l41jpa.service;

import az.ders.l41jpa.entity.Employee;
import az.ders.l41jpa.repo.EmployeeRepository;
import jakarta.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class EmployeeService {

  private final EmployeeRepository employeeRepository;

  @Cacheable("employee")
  public List<Employee> getAllEmployees() {
    log.info("UserService.testUsers.START");
    Employee employee1 = employeeRepository.findById(1L).get();

    return List.of(employee1);
  }

  @SneakyThrows
  private void sleep(int seconds) {
      Thread.sleep(seconds * 1000L);
  }
}
