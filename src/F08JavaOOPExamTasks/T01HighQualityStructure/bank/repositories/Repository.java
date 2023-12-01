package F08JavaOOPExamTasks.T01HighQualityStructure.bank.repositories;

import F08JavaOOPExamTasks.T01HighQualityStructure.bank.entities.loan.Loan;

public interface Repository {

    void addLoan(Loan loan);

    boolean removeLoan(Loan loan);

    Loan findFirst(String type);
}
