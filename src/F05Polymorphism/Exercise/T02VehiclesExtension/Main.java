package F05Polymorphism.Exercise.T02VehiclesExtension;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        double carFuelQuantity = Double.parseDouble(tokens[1]);
        double carFuelConsumption = Double.parseDouble(tokens[2]);
        double tankCapacity = Double.parseDouble(tokens[3]);

        Car car = new Car(carFuelQuantity, carFuelConsumption, tankCapacity);

        tokens = scanner.nextLine().split("\\s+");
        double truckFuelQuantity = Double.parseDouble(tokens[1]);
        double truckFuelConsumption = Double.parseDouble(tokens[2]);
        tankCapacity = Double.parseDouble(tokens[3]);

        Truck truck = new Truck(truckFuelQuantity, truckFuelConsumption, tankCapacity);

        tokens = scanner.nextLine().split("\\s+");
        double busFuelQuantity = Double.parseDouble(tokens[1]);
        double busFuelConsumption = Double.parseDouble(tokens[2]);
        tankCapacity = Double.parseDouble(tokens[3]);

        Bus bus = new Bus(busFuelQuantity, busFuelConsumption, tankCapacity);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            tokens = scanner.nextLine().split("\\s+");
            String commandName = tokens[0];
            String vehicleType = tokens[1];

            switch (commandName) {
                case "Drive":
                    double distance = Double.parseDouble(tokens[2]);
                    Vehicle vehicle = vehicles.get(vehicleType);
                    if (vehicle instanceof Bus) {
                        bus.setFuelConsumption(bus.getFuelConsumption() + Bus.ADDITIONAL_FULL_BUS_CONSUMPTION);
                        System.out.println(bus.drive(distance));
                        bus.setFuelConsumption(bus.getFuelConsumption() - Bus.ADDITIONAL_FULL_BUS_CONSUMPTION);
                        continue;
                    }
                    String driveMessage = vehicles.get(vehicleType).drive(distance);
                    System.out.println(driveMessage);
                    break;
                case "Refuel":
                    double fuelAmount = Double.parseDouble(tokens[2]);
                    vehicles.get(vehicleType).refuel(fuelAmount);
                    break;
                case "DriveEmpty":
                    double driveEmptyDistance = Double.parseDouble(tokens[2]);
                    String driveEmptyMessage = bus.drive(driveEmptyDistance);
                    System.out.println(driveEmptyMessage);
                    break;

            }
        }

        vehicles.values().stream().forEach(System.out::println);
    }
}
