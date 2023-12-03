package F08JavaOOPExamTasks.T01HighQualityStructure.glacialExpedition.models.states;

import F08JavaOOPExamTasks.T01HighQualityStructure.glacialExpedition.common.ExceptionMessages;

import java.util.ArrayList;
import java.util.Collection;

public class StateImpl implements State{
    private String name;
    private Collection<String> exhibits;

    public StateImpl(String name) {
        this.name = name;
        exhibits = new ArrayList<>();
    }

    private void setName(String name) {
        if(name==null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.STATE_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    private void setExhibits(Collection<String> exhibits) {
        this.exhibits = exhibits;
    }

    @Override
    public Collection<String> getExhibits() {
        return this.exhibits;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
