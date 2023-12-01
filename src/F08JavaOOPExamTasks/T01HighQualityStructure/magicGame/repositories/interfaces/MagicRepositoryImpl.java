package F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.repositories.interfaces;

import F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.common.ExceptionMessages;
import F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.models.magics.Magic;

import java.util.Collection;

public class MagicRepositoryImpl implements MagicRepository {

    private Collection<Magic> data;

    public MagicRepositoryImpl(Collection<Magic> data) {
        this.data = data;
    }

    @Override
    public Collection getData() {
        return this.data;
    }

    @Override
    public void addMagic(Magic magic) {
        if (magic == null) {
            throw new NullPointerException(ExceptionMessages.INVALID_MAGIC_REPOSITORY);
        }
        data.add(magic);
    }

    @Override
    public boolean removeMagic(Magic magic) {
        if (data.contains(magic)) {
            data.remove(magic);
            return true;
        }
        return false;
    }

    @Override
    public Object findByName(String name) {
        return data.stream()
                .filter(magic -> magic.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
