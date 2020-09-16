package pl.skarbnik.skarbnik.transaction;

import pl.skarbnik.skarbnik.users.Users;

import java.util.Date;
import java.util.UUID;

public class Transaction {

    private Date date;
    private Money money;
    private Types types;
    private Category category;

    public Transaction(UUID id, Users users){
    }
}


