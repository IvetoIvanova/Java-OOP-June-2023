package F05Polymorphism.Lab.T04WildFarm;

public abstract class Food {
    private Integer quantity;

    public Food(Integer quantity) {
        this.setQuantity(quantity);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
