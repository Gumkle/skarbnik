package pl.skarbnik.skarbnik.models;

import java.util.Date;

public class Transaction {

    private final String id;
    private final Type type;
    private final Category category;
    private final Money money;
    private final Date date;

    public Transaction(String id, Type type, Category category, Money money, Date date) {
        this.id = id;
        this.type = type;
        this.category = category;
        this.money = money;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public Category getCategory() {
        return category;
    }

    public Money getMoney() {
        return money;
    }

    public Date getDate() {
        return date;
    }

}

