package F08JavaOOPExamTasks.T01HighQualityStructure.bank.entities.loan;

public class MortgageLoan extends BaseLoan{
    private static final int MORTGAGE_LOAN_INTEREST_RATE = 3;
    private static final double MORTGAGE_LOAN_AMOUNT = 50000;
    public MortgageLoan() {
        super(MORTGAGE_LOAN_INTEREST_RATE, MORTGAGE_LOAN_AMOUNT);
    }
}
