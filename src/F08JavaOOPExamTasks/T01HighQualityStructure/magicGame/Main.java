package F08JavaOOPExamTasks.T01HighQualityStructure.magicGame;

import F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.core.Engine;
import F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.core.EngineImpl;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
