package pl.skarbnik.skarbnik.models;

import java.util.Date;

public class Transaction {

    private final Date date;
    private Money money;
    private Type type;
    private Category category;

    private int whole = money.getWhole();
    private int decimal = money.getDecimal();
    private String name = String.valueOf(Type.values());
    private String cat = String.valueOf(getCategory());

    public Transaction(Date date, int whole, int decimal, String name, String cat) {
        this.date = date;
        this.whole = whole;
        this.decimal = decimal;
        this.name = name;
        this.cat = cat;

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


