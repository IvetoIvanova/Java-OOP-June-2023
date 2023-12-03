package F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.models.states;

import java.util.Collection;

public interface State {
    Collection<String> getExhibits();

    String getName();
}
