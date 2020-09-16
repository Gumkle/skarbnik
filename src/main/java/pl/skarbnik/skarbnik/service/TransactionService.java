package pl.skarbnik.skarbnik.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.skarbnik.skarbnik.database.FakeDao;
import pl.skarbnik.skarbnik.transaction.Transaction;

import java.util.List;
import java.util.UUID;

@Service
public class TransactionService {

    private FakeDao fakeDao;

    public TransactionService(@Qualifier("fakeDao") FakeDao fakeDao){
        this.fakeDao = fakeDao;
    }

    public int addTransaction(Transaction transaction) {
        return fakeDao.addTransaction(transaction);
    }

    public int editTransaction(UUID id, Transaction transaction) {
        return fakeDao.editTransaction(id, transaction);
    }

    public int deleteTransaction(UUID id) {
        return fakeDao.deleteTransaction(id);
    }

    public List<String> transactionsList() {
        return fakeDao.transactionsList();
    }
}
