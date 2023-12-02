package F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.models.discoverer;

import F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.models.museum.Museum;

public interface Discoverer {
    String getName();

    double getEnergy();

    boolean canDig();

    Museum getMuseum();

    void dig();
}
