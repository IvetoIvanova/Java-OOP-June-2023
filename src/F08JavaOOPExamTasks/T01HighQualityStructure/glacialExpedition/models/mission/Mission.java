package F08JavaOOPExamTasks.T01HighQualityStructure.glacialExpedition.models.mission;

import F08JavaOOPExamTasks.T01HighQualityStructure.glacialExpedition.models.explorers.Explorer;
import F08JavaOOPExamTasks.T01HighQualityStructure.glacialExpedition.models.states.State;


import java.util.Collection;

public interface Mission {
    void explore(State state, Collection<Explorer> explorers);
}
