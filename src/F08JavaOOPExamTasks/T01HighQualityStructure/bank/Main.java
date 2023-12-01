package F08JavaOOPExamTasks.T01HighQualityStructure.bank;

import F08JavaOOPExamTasks.T01HighQualityStructure.bank.core.Engine;
import F08JavaOOPExamTasks.T01HighQualityStructure.bank.core.EngineImpl;

public class Main {
    public static void main(String[] args) {

        Engine engine = new EngineImpl();
        engine.run();
    }
}
