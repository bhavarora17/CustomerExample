package bhavya.restMvc.restCustomer.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerListDTO {
    List<CustomerDTO> customers;
}