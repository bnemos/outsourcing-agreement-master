package kg.megalab.outsourcingagreement.repo;

import kg.megalab.outsourcingagreement.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {
}
