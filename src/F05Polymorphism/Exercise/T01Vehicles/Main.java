package F05Polymorphism.Exercise.T01Vehicles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        double carFuelQuantity = Double.parseDouble(tokens[1]);
        double carFuelConsumption = Double.parseDouble(tokens[2]);

        Car car = new Car(carFuelQuantity, carFuelConsumption);

        tokens = scanner.nextLine().split("\\s+");
        double truckFuelQuantity = Double.parseDouble(tokens[1]);
        double truckFuelConsumption = Double.parseDouble(tokens[2]);

        Truck truck = new Truck(truckFuelQuantity, truckFuelConsumption);

        Map<String, Vehicle> vehicles = new HashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            tokens = scanner.nextLine().split("\\s+");
            String commandName = tokens[0];
            String vehicleType = tokens[1];

            switch (commandName) {
                case "Drive":
                    double distance = Double.parseDouble(tokens[2]);
                    String driveMessage = vehicles.get(vehicleType).drive(distance);
                    System.out.println(driveMessage);
                    break;
                case "Refuel":
                    double fuelAmount = Double.parseDouble(tokens[2]);
                    vehicles.get(vehicleType).refuel(fuelAmount);
                    break;

            }
        }

        vehicles.values().stream().forEach(System.out::println);
    }
}
