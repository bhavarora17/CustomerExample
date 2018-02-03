package bhavya.restMvc.restCustomer.repositories;

import bhavya.restMvc.restCustomer.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findCategoryByName(String name);

}
