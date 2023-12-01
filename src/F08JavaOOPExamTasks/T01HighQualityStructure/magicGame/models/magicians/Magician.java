package F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.models.magicians;

import F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.models.magics.Magic;

public interface Magician {
    String getUsername();

    int getHealth();

    int getProtection();

    Magic getMagic();

    boolean isAlive();

    void takeDamage(int points);
}
