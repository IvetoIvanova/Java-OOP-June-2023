package F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.entities.races;

import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.entities.drivers.Driver;

import java.util.Collection;

public interface Race {
    String getName();

    int getLaps();

    Collection<Driver> getDrivers();

    void addDriver(Driver driver);
}
