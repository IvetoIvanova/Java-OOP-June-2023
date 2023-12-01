package F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.repositories.interfaces;

import F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.models.magicians.Magician;

import java.util.Collection;

public interface MagicianRepository<T> {
    Collection<T> getData();

    void addMagician(Magician model);

    boolean removeMagician(Magician model);

    T findByUsername(String name);
}
