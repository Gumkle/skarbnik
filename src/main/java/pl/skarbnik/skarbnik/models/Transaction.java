package pl.skarbnik.skarbnik.models;

import java.util.Date;

public class Transaction {

    private final Date date;
    private final Money money;
    private final Type type;
    private final Category category;

    public Transaction(Date date, Money money, Type type, Category category) {
        this.date = date;
        this.money = money;
        this.type = type;
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public Money getMoney() {
        return money;
    }

    public Type getType() {
        return type;
    }

    public Category getCategory() {
        return category;
    }
}


