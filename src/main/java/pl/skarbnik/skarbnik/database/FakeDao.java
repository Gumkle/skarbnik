package pl.skarbnik.skarbnik.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pl.skarbnik.skarbnik.models.Money;
import pl.skarbnik.skarbnik.models.Transaction;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@Repository("fakeDao")
public class FakeDao implements TransactionDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public FakeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addTransaction(Transaction transaction) {

       jdbcTemplate.update("INSERT INTO category (name) VALUES (?)", transaction.getCategory());
       jdbcTemplate.update("INSERT INTO type (name) VALUES (?)", transaction.getType());
       jdbcTemplate.update("INSERT INTO money (whole, rest) VALUES (?, ?)", transaction.getMoney().getWhole(), transaction.getMoney().getDecimal());
       jdbcTemplate.update("INSERT INTO transactions (name, category, whole, rest, created) VALUES (?, ?, ?, ?, ?)",
               transaction.getType(),
               transaction.getCategory(),
               transaction.getMoney().getWhole(),
               transaction.getMoney().getDecimal(),
               transaction.getDate());
    }

    @Override
    public void editTransaction(String id, Transaction transaction) {
        jdbcTemplate.update("UPDATE transactions SET name = ?," +
                "category = ?, whole= ?, decimal = ?, created = ? " +
                "WHERE id = ?");
        jdbcTemplate.update("UPDATE type SET name = ? WHERE id = ?");
        jdbcTemplate.update("UPDATE category SET category = ? WHERE id = ?");
        jdbcTemplate.update("UPDATE money SET whole = ?, rest = ? WHERE id = ?");
    }

    @Override
    public void deleteTransaction(String id) {
        jdbcTemplate.update("DELETE FROM transactions WHERE id = ?");
        jdbcTemplate.update("DELETE FROM category WHERE id = ?");
        jdbcTemplate.update("DELETE FROM type WHERE id = ?");
        jdbcTemplate.update("DELETE FROM money WHERE id = ?");
    }

    @Override
    public List<Transaction> transactionsList() {
        String sql = "SELECT * FROM transactions";
        jdbcTemplate.query(sql, this::mapRowToTransaction);
        return transactionsList();
    }

    private Transaction mapRowToTransaction(ResultSet rs, int rowNum) throws SQLException {
        return new Transaction(
                rs.getDate("created"),
                rs.getInt("whole"),
                rs.getInt("rest"),
                rs.getString("name"),
                rs.getString("category"));
    }
}
