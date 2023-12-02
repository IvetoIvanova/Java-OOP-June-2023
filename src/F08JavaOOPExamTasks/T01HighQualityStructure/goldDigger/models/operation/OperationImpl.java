package F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.models.operation;

import F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.models.discoverer.Discoverer;
import F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.models.spot.Spot;

import java.util.Collection;

public class OperationImpl implements Operation {
    @Override
    public void startOperation(Spot spot, Collection<Discoverer> discoverers) {
        Collection<String> spotExhibits = spot.getExhibits();

        for (Discoverer currentDiscoverer : discoverers) {
            while (currentDiscoverer.canDig() && spotExhibits.iterator().hasNext()) {
                currentDiscoverer.dig();
                String currentExhibit = spotExhibits.iterator().next();
                currentDiscoverer.getMuseum().getExhibits().add(currentExhibit);
                spotExhibits.remove(currentExhibit);
            }
        }
    }
}
