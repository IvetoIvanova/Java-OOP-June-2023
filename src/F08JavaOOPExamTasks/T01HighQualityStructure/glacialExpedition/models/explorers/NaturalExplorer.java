package F08JavaOOPExamTasks.T01HighQualityStructure.glacialExpedition.models.explorers;

public class NaturalExplorer extends BaseExplorer {
    private static final double NATURAL_EXPLORER_INITIAL_UNITS_OF_ENERGY = 60;
    private static final double NATURAL_EXPLORER_SEARCH_ENERGY = 7;

    public NaturalExplorer(String name) {
        super(name, NATURAL_EXPLORER_INITIAL_UNITS_OF_ENERGY);
    }

    @Override
    public void search() {
        if (getEnergy() <= NATURAL_EXPLORER_SEARCH_ENERGY) {
            setEnergy(0);
        } else {
            setEnergy(getEnergy() - NATURAL_EXPLORER_SEARCH_ENERGY);
        }
    }
}
