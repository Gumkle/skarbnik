package pl.skarbnik.skarbnik.transaction;

import java.util.Date;

public class Transaction {

    private Date date;
    private Money money;
    private Types types;
    private Category category;

    public Transaction(Date date, Money money, Types types, Category category) {
        this.date = date;
        this.money = money;
        this.types = types;
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public Money getMoney() {
        return money;
    }

    public Types getTypes() {
        return types;
    }

    public Category getCategory() {
        return category;
    }
}


