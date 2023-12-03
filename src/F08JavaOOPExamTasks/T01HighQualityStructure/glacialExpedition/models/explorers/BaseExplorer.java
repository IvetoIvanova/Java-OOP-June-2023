package F08JavaOOPExamTasks.T01HighQualityStructure.glacialExpedition.models.explorers;

import F08JavaOOPExamTasks.T01HighQualityStructure.glacialExpedition.common.ExceptionMessages;
import F08JavaOOPExamTasks.T01HighQualityStructure.glacialExpedition.models.suitcases.Carton;
import F08JavaOOPExamTasks.T01HighQualityStructure.glacialExpedition.models.suitcases.Suitcase;

public abstract class BaseExplorer implements Explorer {
    private String name;
    private double energy;
    private Suitcase suitcase;
    private static final double BASE_SEARCH_ENERGY = 15;
    public BaseExplorer(String name, double energy) {
        this.setName(name);
        this.setEnergy(energy);
        suitcase = new Carton();
    }

    protected void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.EXPLORER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    protected void setEnergy(double energy) {
        if (energy < 0) {
            throw new IllegalArgumentException(ExceptionMessages.EXPLORER_ENERGY_LESS_THAN_ZERO);
        }
        this.energy = energy;
    }

    protected void setSuitcase(Suitcase suitcase) {
        this.suitcase = suitcase;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getEnergy() {
        return this.energy;
    }

    @Override
    public boolean canSearch() {
        return energy > 0;
    }

    @Override
    public Suitcase getSuitcase() {
        return this.suitcase;
    }

    @Override
    public void search() {
        energy -= BASE_SEARCH_ENERGY;
        if (energy < 0) {
            energy = 0;
        }
    }
}
