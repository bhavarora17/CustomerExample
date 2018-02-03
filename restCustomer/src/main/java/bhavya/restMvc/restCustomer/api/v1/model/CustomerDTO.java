package bhavya.restMvc.restCustomer.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    String firstname;
    String lastname;

    @JsonProperty("customer_url")
    String customerUrl;

}
