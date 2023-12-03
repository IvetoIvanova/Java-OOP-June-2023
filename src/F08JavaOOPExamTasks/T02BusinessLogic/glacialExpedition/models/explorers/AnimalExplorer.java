package F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.models.explorers;

public class AnimalExplorer extends BaseExplorer{
    private static final double ANIMAL_EXPLORER_INITIAL_UNITS_OF_ENERGY = 100;

    public AnimalExplorer(String name) {
        super(name, ANIMAL_EXPLORER_INITIAL_UNITS_OF_ENERGY);
    }
}
