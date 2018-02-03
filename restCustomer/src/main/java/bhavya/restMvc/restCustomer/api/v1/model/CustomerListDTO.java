package bhavya.restMvc.restCustomer.api.v1.model;

import java.util.List;

public class CustomerListDTO {
    List<CustomerDTO> customers;

    @java.beans.ConstructorProperties({"customers"})
    public CustomerListDTO(List<CustomerDTO> customers) {
        this.customers = customers;
    }

    public CustomerListDTO() {
    }

    public List<CustomerDTO> getCustomers() {
        return this.customers;
    }

    public void setCustomers(List<CustomerDTO> customers) {
        this.customers = customers;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof CustomerListDTO)) return false;
        final CustomerListDTO other = (CustomerListDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$customers = this.getCustomers();
        final Object other$customers = other.getCustomers();
        if (this$customers == null ? other$customers != null : !this$customers.equals(other$customers)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $customers = this.getCustomers();
        result = result * PRIME + ($customers == null ? 43 : $customers.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof CustomerListDTO;
    }

    public String toString() {
        return "CustomerListDTO(customers=" + this.getCustomers() + ")";
    }
}
