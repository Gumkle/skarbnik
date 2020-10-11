package pl.skarbnik.skarbnik.database;

import org.springframework.stereotype.Repository;
import pl.skarbnik.skarbnik.models.Transaction;

import java.util.*;

@Repository("fakeDao")
public class FakeDao implements TransactionDAO {

    private Map<UUID, Transaction> map = new HashMap<>();

    @Override
    public void addTransaction(Transaction transaction) {
        UUID id = UUID.randomUUID();
        map.put(id, transaction);
    }

    @Override
    public void editTransaction(String id, Transaction transaction) {
        map.replace(UUID.fromString(id), transaction);
    }

    @Override
    public void deleteTransaction(String id) {
        map.remove(UUID.fromString(id));
    }

    @Override
    public List<Transaction> getTransactionsList() {
        List<Transaction> list = new ArrayList(map.values());
        return list;
    }
}
