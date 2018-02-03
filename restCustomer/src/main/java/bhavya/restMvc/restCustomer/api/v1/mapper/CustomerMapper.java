package bhavya.restMvc.restCustomer.api.v1.mapper;

import bhavya.restMvc.restCustomer.api.v1.model.CustomerDTO;
import bhavya.restMvc.restCustomer.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    CustomerDTO customerToCustomerDTO(Customer customer);
}
