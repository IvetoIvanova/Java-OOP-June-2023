package F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.io;

import F08JavaOOPExamTasks.T01HighQualityStructure.christmasRaces.io.interfaces.OutputWriter;

public class ConsoleWriter implements OutputWriter {
    @Override
    public void writeLine(String text) {
        System.out.println(text);
    }
}
