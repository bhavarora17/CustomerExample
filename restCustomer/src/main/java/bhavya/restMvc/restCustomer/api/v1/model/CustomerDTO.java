package bhavya.restMvc.restCustomer.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    String firstname;
    String lastname;

    @JsonProperty("customer_url")
    String customerUrl;

    protected boolean canEqual(Object other) {
        return other instanceof CustomerDTO;
    }

}
