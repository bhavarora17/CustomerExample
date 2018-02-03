package bhavya.restMvc.restCustomer.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CustomerDTO {

    String firstName;
    String lastName;

    @JsonProperty("customer_url")
    String customerUrl;

    public CustomerDTO() {
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getCustomerUrl() {
        return this.customerUrl;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCustomerUrl(String customerUrl) {
        this.customerUrl = customerUrl;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof CustomerDTO)) return false;
        final CustomerDTO other = (CustomerDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$firstName = this.getFirstName();
        final Object other$firstName = other.getFirstName();
        if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        final Object this$customerUrl = this.getCustomerUrl();
        final Object other$customerUrl = other.getCustomerUrl();
        if (this$customerUrl == null ? other$customerUrl != null : !this$customerUrl.equals(other$customerUrl))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $firstName = this.getFirstName();
        result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $customerUrl = this.getCustomerUrl();
        result = result * PRIME + ($customerUrl == null ? 43 : $customerUrl.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof CustomerDTO;
    }

    public String toString() {
        return "CustomerDTO(firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", customerUrl=" + this.getCustomerUrl() + ")";
    }
}
