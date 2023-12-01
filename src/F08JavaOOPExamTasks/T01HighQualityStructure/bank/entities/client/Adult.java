package F08JavaOOPExamTasks.T01HighQualityStructure.bank.entities.client;

public class Adult extends BaseClient {
    private static final int ADULT_INITIAL_INTERESTS = 4;
    private static final int INCREASES_FACTOR = 2;

    public Adult(String name, String ID, double income) {
        super(name, ID, ADULT_INITIAL_INTERESTS, income);
    }

    @Override
    public void increase() {
        setInterest(getInterest() + INCREASES_FACTOR);
    }
}
