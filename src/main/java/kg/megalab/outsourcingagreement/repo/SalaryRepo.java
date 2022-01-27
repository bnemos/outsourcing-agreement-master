package kg.megalab.outsourcingagreement.repo;

import kg.megalab.outsourcingagreement.models.Salaries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepo extends JpaRepository<Salaries,Long> {
}
