package F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.repositories;

import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.entities.races.Race;
import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.repositories.interfaces.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class RaceRepository implements Repository<Race> {
    private Map<String, Race> races;

    public RaceRepository() {
        races = new LinkedHashMap<>();
    }

    @Override
    public Race getByName(String name) {
        return races.get(name);
    }

    @Override
    public Collection<Race> getAll() {
        return Collections.unmodifiableCollection(races.values());
    }

    @Override
    public void add(Race race) {
        races.putIfAbsent(race.getName(), race);
    }

    @Override
    public boolean remove(Race race) {
        return races.remove(race.getName()) != null;
    }
}
