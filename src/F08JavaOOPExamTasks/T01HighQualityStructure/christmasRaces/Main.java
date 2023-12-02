package F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces;

import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.core.ControllerImpl;
import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.core.EngineImpl;
import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.core.interfaces.Controller;
import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.entities.cars.Car;
import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.entities.drivers.Driver;
import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.entities.races.Race;
import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.io.ConsoleReader;
import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.io.ConsoleWriter;
import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.repositories.CarRepository;
import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.repositories.DriverRepository;
import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.repositories.RaceRepository;
import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.repositories.interfaces.Repository;

public class Main {
    public static void main(String[] args) {
        Repository<Car> carRepository = new CarRepository();
        Repository<Race> raceRepository = new RaceRepository();
        Repository<Driver> driverRepository = new DriverRepository();

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();

    }
}
