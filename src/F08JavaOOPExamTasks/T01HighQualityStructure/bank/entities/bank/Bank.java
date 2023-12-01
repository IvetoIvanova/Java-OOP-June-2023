package F08JavaOOPExamTasks.T01HighQualityStructure.bank.entities.bank;

import F08JavaOOPExamTasks.T01HighQualityStructure.bank.entities.client.Client;
import F08JavaOOPExamTasks.T01HighQualityStructure.bank.entities.loan.Loan;

import java.util.Collection;

public interface Bank {
    String getName();

    void setName(String name);

    Collection<Client> getClients();

    Collection<Loan> getLoans();

    void addClient(Client client);

    void removeClient(Client client);

    void addLoan(Loan loan);

    int sumOfInterestRates();

    String getStatistics();
}
