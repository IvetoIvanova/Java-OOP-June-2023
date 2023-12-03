package F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition;

import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.core.Controller;
import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.core.ControllerImpl;
import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.core.Engine;
import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
