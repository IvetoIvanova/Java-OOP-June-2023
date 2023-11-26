package F04InterfacesAndAbstraction.Lab.T02CarShopExtend;

public class Seat extends CarImpl implements Sellable {

    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    public String toString() {
        String pattern = "This is %s produced in %s and have %d tires\n" +
                "Leon sells for %f";
        return String.format(pattern, this.getModel(),
                this.countryProduced(),
                TIRES, this.getPrice());
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
