package kg.megalab.outsourcingagreement.repo;

import kg.megalab.outsourcingagreement.models.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employees, Long> {

}
