package F08JavaOOPExamTasks.T01HighQualityStructure.bank.entities.bank;

public class CentralBank extends BaseBank{
    private static final int DEFAULT_CAPACITY = 50;
    public CentralBank(String name) {
        super(name, DEFAULT_CAPACITY);
    }
}
