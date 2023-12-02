package F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.entities.drivers;

import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.entities.cars.Car;

public interface Driver {
    String getName();

    Car getCar();

    int getNumberOfWins();

    void addCar(Car car);

    void winRace();

    boolean getCanParticipate();
}
