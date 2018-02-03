package bhavya.restMvc.restCustomer.services;

import bhavya.restMvc.restCustomer.api.v1.mapper.CustomerMapper;
import bhavya.restMvc.restCustomer.api.v1.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {

        List<CustomerDTO> getAllCustomers();

        CustomerDTO getCustomerById(Long id);

}