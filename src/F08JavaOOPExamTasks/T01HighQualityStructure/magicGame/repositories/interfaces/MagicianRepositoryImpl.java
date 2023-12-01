package F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.repositories.interfaces;

import F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.common.ExceptionMessages;
import F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.models.magicians.Magician;

import java.util.Collection;

public class MagicianRepositoryImpl implements MagicianRepository {
    private Collection<Magician> data;

    public MagicianRepositoryImpl(Collection<Magician> data) {
        this.data = data;
    }

    @Override
    public Collection getData() {
        return this.data;
    }

    @Override
    public void addMagician(Magician magician) {
        if (magician == null) {
            throw new NullPointerException(ExceptionMessages.INVALID_MAGICIAN_REPOSITORY);
        }
        data.add(magician);
    }

    @Override
    public boolean removeMagician(Magician magician) {
        if (data.contains(magician)) {
            data.remove(magician);
            return true;
        }
        return false;

    }

    @Override
    public Object findByUsername(String name) {
        return data.stream()
                .filter(magician -> magician.getUsername().equals(name))
                .findFirst()
                .orElse(null);
    }

}
