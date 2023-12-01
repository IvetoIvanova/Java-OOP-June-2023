package F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.repositories.interfaces;

import F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.models.magics.Magic;

import java.util.Collection;

public interface MagicRepository<T> {
    Collection<T> getData();

    void addMagic(Magic model);

    boolean removeMagic(Magic model);

    T findByName(String name);
}
