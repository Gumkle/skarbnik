package pl.skarbnik.skarbnik.database;

import pl.skarbnik.skarbnik.models.Transaction;

import java.util.List;

public interface TransactionDAO {

    void addTransaction(Transaction transaction);
    void editTransaction(String id, Transaction transaction);
    void deleteTransaction(String id);
    List<Transaction> transactionsList();

    }

