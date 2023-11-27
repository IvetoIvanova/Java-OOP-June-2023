package F05Polymorphism.Exercise.T01Vehicles;

public class Car extends BaseVehicle {

    private final static double ADDITIONAL_AC_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.fuelConsumption = this.fuelConsumption + ADDITIONAL_AC_CONSUMPTION;
    }
}
