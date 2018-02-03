package bhavya.restMvc.restCustomer.api.v1.model;

import java.util.List;

public class CategoryListDTO {
    List<CategoryDTO> categories;

    @java.beans.ConstructorProperties({"categories"})
    public CategoryListDTO(List<CategoryDTO> categories) {
        this.categories = categories;
    }

    public CategoryListDTO() {
    }

    public List<CategoryDTO> getCategories() {
        return this.categories;
    }

    public void setCategories(List<CategoryDTO> categories) {
        this.categories = categories;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof CategoryListDTO)) return false;
        final CategoryListDTO other = (CategoryListDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$categories = this.getCategories();
        final Object other$categories = other.getCategories();
        if (this$categories == null ? other$categories != null : !this$categories.equals(other$categories))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $categories = this.getCategories();
        result = result * PRIME + ($categories == null ? 43 : $categories.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof CategoryListDTO;
    }

    public String toString() {
        return "CategoryListDTO(categories=" + this.getCategories() + ")";
    }
}
