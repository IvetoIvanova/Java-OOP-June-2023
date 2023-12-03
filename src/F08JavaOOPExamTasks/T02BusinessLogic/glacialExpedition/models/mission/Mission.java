package F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.models.mission;

import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.models.explorers.Explorer;
import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.models.states.State;


import java.util.Collection;

public interface Mission {
    void explore(State state, Collection<Explorer> explorers);
}
