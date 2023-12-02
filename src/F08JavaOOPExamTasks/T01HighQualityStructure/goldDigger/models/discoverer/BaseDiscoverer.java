package F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.models.discoverer;

import F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.common.ExceptionMessages;
import F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.models.museum.Museum;

public abstract class BaseDiscoverer implements Discoverer {
    private String name;
    private double energy;
    private Museum museum;

    public BaseDiscoverer(String name, double energy) {
        this.setName(name);
        this.setEnergy(energy);
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
    public Museum getMuseum() {
        return this.museum;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.DISCOVERER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    private void setEnergy(double energy) {
        if (energy < 0) {
            throw new IllegalArgumentException(ExceptionMessages.DISCOVERER_ENERGY_LESS_THAN_ZERO);
        }
        this.energy = energy;
    }

    private void setMuseum(Museum museum) {
        this.museum = museum;
    }

    @Override
    public boolean canDig() {
        return this.energy > 0;
    }

    //TODO debug dig() method
    @Override
    public void dig() {
        this.energy -= 15;
        if (energy < 0) {
            this.energy = 0;
        }
    }

    //protected abstract void dig(double energy);
}
