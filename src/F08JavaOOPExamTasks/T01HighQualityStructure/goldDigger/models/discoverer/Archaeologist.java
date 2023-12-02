package F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.models.discoverer;

import F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.models.museum.Museum;

public class Archaeologist extends BaseDiscoverer{
    private final static int INITIAL_UNITS_OF_ENERGY= 60;

    public Archaeologist(String name, double energy) {
        super(name, INITIAL_UNITS_OF_ENERGY);
    }

}
