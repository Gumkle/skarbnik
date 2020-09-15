package pl.skarbnik.skarbnik.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping()
@Controller
public class ViewController {

    @GetMapping
    public String home(ModelMap map) {
        map.put("view", "list");
        return "general";
    }

}
