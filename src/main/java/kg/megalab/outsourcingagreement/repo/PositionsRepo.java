package kg.megalab.outsourcingagreement.repo;

import kg.megalab.outsourcingagreement.models.Positions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionsRepo extends JpaRepository<Positions, Long> {
}
