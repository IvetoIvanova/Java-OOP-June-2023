package F08JavaOOPExamTasks.T01HighQualityStructure.glacialExpedition.models.explorers;

import F08JavaOOPExamTasks.T01HighQualityStructure.glacialExpedition.models.suitcases.Suitcase;

public interface Explorer {
    String getName();

    double getEnergy();

    boolean canSearch();

    Suitcase getSuitcase();

    void search();
}
