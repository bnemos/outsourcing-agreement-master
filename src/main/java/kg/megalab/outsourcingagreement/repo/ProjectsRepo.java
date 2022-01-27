package kg.megalab.outsourcingagreement.repo;

import kg.megalab.outsourcingagreement.models.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsRepo extends JpaRepository<Projects, Long> {
}
