package F08JavaOOPExamTasks.T01HighQualityStructure.glacialExpedition;

import F08JavaOOPExamTasks.T01HighQualityStructure.glacialExpedition.core.Controller;
import F08JavaOOPExamTasks.T01HighQualityStructure.glacialExpedition.core.ControllerImpl;
import F08JavaOOPExamTasks.T01HighQualityStructure.glacialExpedition.core.Engine;
import F08JavaOOPExamTasks.T01HighQualityStructure.glacialExpedition.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
