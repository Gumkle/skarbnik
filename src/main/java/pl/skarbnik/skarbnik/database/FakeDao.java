package pl.skarbnik.skarbnik.database;

import pl.skarbnik.skarbnik.transaction.Transactions;

import java.util.*;

public class FakeDao implements TransactionDAO {

    private Map<UUID, Transactions> map = new HashMap<>();

    @Override
    public int insertTransaction(Transactions transaction) {
        UUID id = UUID.randomUUID();
        map.put(id, transaction);
        return 1;
    }

    @Override
    public int editTransaction(UUID id, Transactions transaction) {
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
