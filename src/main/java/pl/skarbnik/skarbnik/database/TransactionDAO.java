package pl.skarbnik.skarbnik.database;

import pl.skarbnik.skarbnik.transaction.Transaction;

import java.util.List;
import java.util.UUID;

public interface TransactionDAO {

    int addTransaction(Transaction transaction);
    int editTransaction(UUID id, Transaction transaction);
    int deleteTransaction(UUID id);
    List<Transaction> transactionsList();

    }

