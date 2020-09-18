package pl.skarbnik.skarbnik.transaction;

import java.util.Date;

public class Transaction {

    private final Date date;
    private final Money money;
    private final Types types;
    private final Category category;

    public Transaction(Date date, Money money, Types types, Category category) {
        this.date = date;
        this.money = money;
        this.types = types;
        this.category = category;
    }
}


