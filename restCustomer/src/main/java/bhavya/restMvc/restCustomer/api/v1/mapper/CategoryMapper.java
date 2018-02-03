package bhavya.restMvc.restCustomer.api.v1.mapper;

import bhavya.restMvc.restCustomer.api.v1.model.CategoryDTO;
import bhavya.restMvc.restCustomer.domain.Category;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
