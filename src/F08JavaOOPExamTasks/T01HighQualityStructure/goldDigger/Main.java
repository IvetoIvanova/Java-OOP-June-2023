package F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger;

import F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.core.Controller;
import F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.core.ControllerImpl;
import F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.core.Engine;
import F08JavaOOPExamTasks.T01HighQualityStructure.goldDigger.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
