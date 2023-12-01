package F08JavaOOPExamTasks.T01HighQualityStructure.bank.entities.client;

public class Student extends BaseClient {
    private static final int STUDENT_INITIAL_INTERESTS = 2;
    private static final int INCREASES_FACTOR = 1;

    public Student(String name, String ID, double income) {
        super(name, ID, STUDENT_INITIAL_INTERESTS, income);
    }

    @Override
    public void increase() {
        setInterest(getInterest() + INCREASES_FACTOR);
    }
}
