package F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.models.discoverer;

public class Geologist extends BaseDiscoverer{
    private final static int INITIAL_UNITS_OF_ENERGY= 100;
    public Geologist(String name, double energy) {
        super(name, INITIAL_UNITS_OF_ENERGY);
    }
}
