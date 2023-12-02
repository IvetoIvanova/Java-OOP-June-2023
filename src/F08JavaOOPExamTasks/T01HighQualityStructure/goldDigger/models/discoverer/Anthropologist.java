package F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.models.discoverer;

public class Anthropologist extends BaseDiscoverer{
    private final static int INITIAL_UNITS_OF_ENERGY= 40;
    public Anthropologist(String name, double energy) {
        super(name, INITIAL_UNITS_OF_ENERGY);
    }
}
