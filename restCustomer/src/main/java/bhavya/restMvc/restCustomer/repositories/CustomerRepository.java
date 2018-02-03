package bhavya.restMvc.restCustomer.repositories;

import bhavya.restMvc.restCustomer.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
