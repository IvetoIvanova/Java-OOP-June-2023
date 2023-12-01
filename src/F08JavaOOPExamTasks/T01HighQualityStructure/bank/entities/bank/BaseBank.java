package F08JavaOOPExamTasks.T01HighQualityStructure.bank.entities.bank;

import F08JavaOOPExamTasks.T01HighQualityStructure.bank.common.ExceptionMessages;
import F08JavaOOPExamTasks.T01HighQualityStructure.bank.entities.client.Client;
import F08JavaOOPExamTasks.T01HighQualityStructure.bank.entities.loan.Loan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public abstract class BaseBank implements Bank {
    private String name;
    private int capacity;
    private Collection<Loan> loans;
    private Collection<Client> clients;

    protected BaseBank(String name, int capacity) {
        this.setName(name);
        this.setCapacity(capacity);
        loans = new ArrayList<>();
        clients = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.BANK_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    protected void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public Collection<Client> getClients() {
        return Collections.unmodifiableCollection(this.clients);
    }

    @Override
    public Collection<Loan> getLoans() {
        return Collections.unmodifiableCollection(this.loans);
    }

    @Override
    public void addClient(Client client) {
        if (this.getClients().size() >= this.capacity) {
            throw new IllegalStateException(ExceptionMessages.NOT_ENOUGH_CAPACITY_FOR_CLIENT);
        }
        this.clients.add(client);
    }

    @Override
    public void removeClient(Client client) {
        this.clients.remove(client);
    }

    @Override
    public void addLoan(Loan loan) {
        this.loans.add(loan);
    }

    @Override
    public int sumOfInterestRates() {
        return this.getLoans()
                .stream()
                .mapToInt(Loan::getInterestRate)
                .sum();
    }

    @Override
    public String getStatistics() {
        String template = "Name: %s, Type: %s" + System.lineSeparator()
                + "Clients: %s" + System.lineSeparator()
                + "Loans: %d, Sum of interest rates: %d";

        return String.format(template,
                this.getName(),
                this.getClass().getSimpleName(),
                this.getClients().isEmpty() ?
                        "none" :
                        this.getClients().stream().map(Client::getName)
                                .collect(Collectors.joining(", ")),
                this.getLoans().size(),
                this.sumOfInterestRates());
    }
}
