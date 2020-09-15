package pl.skarbnik.skarbnik.database;

import pl.skarbnik.skarbnik.transaction.Transactions;

import java.util.List;
import java.util.UUID;

public interface TransactionDAO {

    int insertTransaction(Transactions transaction);
    int editTransaction(UUID id, Transactions transaction);
    int deleteTransaction(UUID id);
    List<String> transactionsList();

    }

