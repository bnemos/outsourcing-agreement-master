package kg.megalab.outsourcingagreement.repo;

import kg.megalab.outsourcingagreement.models.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employees, Long> {

}
