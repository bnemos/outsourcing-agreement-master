package kg.megalab.outsourcingagreement.repo;

import kg.megalab.outsourcingagreement.models.EmployeesInProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesInProjectRepo extends JpaRepository<EmployeesInProject, Long> {
}
