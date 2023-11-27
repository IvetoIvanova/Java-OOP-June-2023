package F05Polymorphism.Exercise.T02VehiclesExtension;

public class Truck extends BaseVehicle {
    private final static double ADDITIONAL_AC_CONSUMPTION = 1.6;
    private final static double PERCENTAGE_OF_REFUEL = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.fuelConsumption = this.fuelConsumption + ADDITIONAL_AC_CONSUMPTION;
    }

    @Override
    public void refuel(double liters) {
        liters = liters * PERCENTAGE_OF_REFUEL;
        super.refuel(liters);
    }
}
