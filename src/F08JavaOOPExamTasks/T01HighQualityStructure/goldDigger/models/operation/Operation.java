package F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.models.operation;

import F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.models.discoverer.Discoverer;
import F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.models.spot.Spot;

import java.util.Collection;

public interface Operation {
    void startOperation(Spot spot, Collection<Discoverer> discoverers);

}
