package pl.skarbnik.skarbnik.database;

import org.springframework.stereotype.Repository;
import pl.skarbnik.skarbnik.transaction.Transaction;

import java.util.*;

@Repository("fakeDao")
public class FakeDao implements TransactionDAO {

    private Map<UUID, Transaction> map = new HashMap<>();

    @Override
    public int addTransaction(Transaction transaction) {
        UUID id = UUID.randomUUID();
        map.put(id, transaction);
        return 1;
    }

    @Override
    public int editTransaction(UUID id, Transaction transaction) {
        map.replace(id, transaction);
        return 1;
    }

    @Override
    public int deleteTransaction(UUID id) {
        map.remove(id);
        return 1;
    }

    @Override
    public List<String> transactionsList() {
        List<String> list = new ArrayList(map.values());
        return list;
    }
}
