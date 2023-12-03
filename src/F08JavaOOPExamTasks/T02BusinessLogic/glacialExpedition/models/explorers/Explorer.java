package F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.models.explorers;

import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.models.suitcases.Suitcase;

public interface Explorer {
    String getName();

    double getEnergy();

    boolean canSearch();

    Suitcase getSuitcase();

    void search();
}
