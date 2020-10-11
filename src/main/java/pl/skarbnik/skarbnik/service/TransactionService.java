package pl.skarbnik.skarbnik.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.skarbnik.skarbnik.database.TransactionDAO;
import pl.skarbnik.skarbnik.models.Transaction;

import java.util.List;

@Service
public class TransactionService {

    private TransactionDAO transactionDAO;

    public TransactionService(@Qualifier("fakeDao") TransactionDAO transactionDAO){
        this.transactionDAO = transactionDAO;
    }

    public void addTransaction(Transaction transaction) {
        transactionDAO.addTransaction(transaction);
    }

    public void editTransaction(String id, Transaction transaction) {
        transactionDAO.editTransaction(id, transaction);
    }

    public void deleteTransaction(String id) {
         transactionDAO.deleteTransaction(id);
    }

    public List<Transaction> transactionsList() {
        return transactionDAO.getTransactionsList();
    }
}
