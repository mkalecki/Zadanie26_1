package multiplyof3and5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private Calculator calculator;

    public HomeController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("input", new InputData());

        return "index";
    }

    @PostMapping("/calculate")
    @ResponseBody
    public String calculate(InputData model) {
        int result = calculator.calculate(model.getCalcLimit());
        return "Wynik to : " + result;
    }

}
