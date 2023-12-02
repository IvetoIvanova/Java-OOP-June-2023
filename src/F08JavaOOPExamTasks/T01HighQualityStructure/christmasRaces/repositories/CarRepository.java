package F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.repositories;

import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.entities.cars.Car;
import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.repositories.interfaces.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class CarRepository implements Repository<Car> {
    private Map<String, Car> cars;

    public CarRepository() {
        cars = new LinkedHashMap<>();
    }

    @Override
    public Car getByName(String name) {
        return cars.get(name);
    }

    @Override
    public Collection<Car> getAll() {
        return Collections.unmodifiableCollection(cars.values());
    }

    @Override
    public void add(Car car) {
        cars.put(car.getModel(), car);
    }

    @Override
    public boolean remove(Car car) {
        return cars.remove(car.getModel()) != null;
    }
}
