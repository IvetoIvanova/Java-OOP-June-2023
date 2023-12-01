package F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.models.magicians;

import F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.models.magics.Magic;

public class Wizard extends MagicianImpl{
    public Wizard(String username, int health, int protection, Magic magic) {
        super(username, health, protection, magic);
    }
}
