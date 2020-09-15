package pl.skarbnik.skarbnik.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class ViewController {

    @GetMapping
    public String list(ModelMap map) {
        map.put("view", "list");
        return "general";
    }

    @GetMapping("/{id}/confirmation")
    public String deleteConfirmation(ModelMap map, @PathVariable("id") String transactionId) {
        map.put("view", "deleteConfirmation");
        return "general";
    }

    @GetMapping("/create")
    public String createTransaction(ModelMap map) {
        map.put("view", "transactionForm");
        return "general";
    }

    @GetMapping("/{id}/update")
    public String editTransaction(ModelMap map, @PathVariable("id") String transactionId) {
        map.put("view", "transactionForm");
        return "general";
    }

}
