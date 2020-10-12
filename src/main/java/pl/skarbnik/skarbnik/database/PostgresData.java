package pl.skarbnik.skarbnik.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pl.skarbnik.skarbnik.models.Transaction;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostgresData implements TransactionDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PostgresData(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addTransaction(Transaction transaction) {
        jdbcTemplate.update("INSERT INTO transactions (type, category, money, created)" +
                "VALUES (?, ? , ?, ?)", transaction.getType().getId(), transaction.getCategory().getId(),
                transaction.getMoney().getId(), transaction.getDate());

    }

    @Override
    public void editTransaction(String id, Transaction transaction) {
        jdbcTemplate.update("UPDATE transactions SET type = ?," +
                "category = ?, money = ?, created = ? WHERE id = ?", id, transaction.getId());

    }

    @Override
    public void deleteTransaction(String id) {
        jdbcTemplate.update("DELETE FROM transactions WHERE id = ?", id);

    }

    @Override
    public List<Transaction> getTransactionsList() {
        List<Transaction> transactionList = jdbcTemplate.query("SELECT * FROM transactions", new BeanPropertyRowMapper<>(Transaction.class));
        return transactionList;
    }
}
