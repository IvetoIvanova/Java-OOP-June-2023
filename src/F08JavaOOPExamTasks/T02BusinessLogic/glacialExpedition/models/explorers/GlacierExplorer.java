package F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.models.explorers;

public class GlacierExplorer extends BaseExplorer{
    private static final double GLACIER_EXPLORER_INITIAL_UNITS_OF_ENERGY = 40;
    public GlacierExplorer(String name) {
        super(name, GLACIER_EXPLORER_INITIAL_UNITS_OF_ENERGY);
    }
}
