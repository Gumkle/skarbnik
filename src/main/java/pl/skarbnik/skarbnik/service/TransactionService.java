package pl.skarbnik.skarbnik.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.skarbnik.skarbnik.database.FakeDao;
import pl.skarbnik.skarbnik.database.TransactionDAO;
import pl.skarbnik.skarbnik.transaction.Transaction;

import java.util.List;
import java.util.UUID;

@Service
public class TransactionService {

    private TransactionDAO transactionDAO;

    public TransactionService(@Qualifier("fakeDao") TransactionDAO transactionDAO){
        this.transactionDAO = transactionDAO;
    }

    public int addTransaction(Transaction transaction) {
        return transactionDAO.addTransaction(transaction);
    }

    public int editTransaction(UUID id, Transaction transaction) {
        return transactionDAO.editTransaction(id, transaction);
    }

    public int deleteTransaction(UUID id) {
        return transactionDAO.deleteTransaction(id);
    }

    public List<Transaction> transactionsList() {
        return transactionDAO.transactionsList();
    }
}
