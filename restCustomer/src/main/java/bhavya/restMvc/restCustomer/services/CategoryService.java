package bhavya.restMvc.restCustomer.services;

import bhavya.restMvc.restCustomer.api.v1.model.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
