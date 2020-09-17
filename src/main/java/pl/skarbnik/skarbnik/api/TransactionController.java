package pl.skarbnik.skarbnik.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.skarbnik.skarbnik.service.TransactionService;
import pl.skarbnik.skarbnik.transaction.Transaction;

import java.util.List;
import java.util.UUID;

@RequestMapping
@RestController
public class TransactionController {

    private TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public void addTransaction(@RequestBody Transaction transaction) {
        transactionService.addTransaction(transaction);
    }

    @PutMapping("{id}")
    public void editTransaction(@PathVariable("id") UUID id,@RequestBody Transaction transaction) {
        transactionService.editTransaction(id, transaction);
    }

    @DeleteMapping("{id}")
    public void deleteTransaction(@PathVariable("id") UUID id) {
        transactionService.deleteTransaction(id);
    }

    @GetMapping
    public List<Transaction> listTransaction() {
      return transactionService.transactionsList();
    }
}
