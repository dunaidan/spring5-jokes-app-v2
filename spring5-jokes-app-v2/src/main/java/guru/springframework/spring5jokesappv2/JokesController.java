package guru.springframework.spring5jokesappv2;

import guru.springframework.spring5jokesappv2.service.GuruJokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final GuruJokesService guruJokesService;

    public JokesController(GuruJokesService guruJokesService) {
        this.guruJokesService = guruJokesService;
    }

    @RequestMapping("/")
    public String getRandomQuote(Model model) {
        model.addAttribute("joke", guruJokesService.getRandomQuote());
        return "index";
    }
}
