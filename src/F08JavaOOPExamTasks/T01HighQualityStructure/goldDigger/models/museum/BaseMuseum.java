package F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.models.museum;

import java.util.ArrayList;
import java.util.Collection;

public class BaseMuseum implements Museum{
    private Collection<String> exhibits;

    public BaseMuseum() {
        exhibits = new ArrayList<>();
    }

    //TODO: check
    @Override
    public Collection<String> getExhibits() {
        return this.exhibits;
    }
}