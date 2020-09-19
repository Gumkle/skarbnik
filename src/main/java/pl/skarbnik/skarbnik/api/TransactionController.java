package pl.skarbnik.skarbnik.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.skarbnik.skarbnik.service.TransactionService;
import pl.skarbnik.skarbnik.models.Transaction;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/transactions")
@RestController
public class TransactionController {

    private TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/")
    public void addTransaction(@RequestBody Transaction transaction) {
        transactionService.addTransaction(transaction);
    }

    @PutMapping("/{id}")
    public void editTransaction(@PathVariable("id") String id,@RequestBody Transaction transaction) {
        transactionService.editTransaction(id, transaction);
    }

    @DeleteMapping("{transaction}")
    public void deleteTransaction(@PathVariable("id") String id) {
        transactionService.deleteTransaction(id);
    }

    @GetMapping("{transaction}")
    public List<Transaction> listTransaction() {
      return transactionService.transactionsList();
    }
}
