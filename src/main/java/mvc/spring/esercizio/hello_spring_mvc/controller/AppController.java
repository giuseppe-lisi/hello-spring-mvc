package mvc.spring.esercizio.hello_spring_mvc.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class AppController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/add")
    public String addizionatore(Model model, @RequestParam int num1, int num2) {
        int sum = num1 + num2;

        model.addAttribute("sum", sum);

        return "addizionatore";
    }

    @GetMapping("/dice")
    public String dice(Model model) {
        Random rand = new Random();
        int num = rand.nextInt(1,7);

        model.addAttribute("num", num);

        return "dice";
    }

    @GetMapping("/converter")
    public String convert(Model model, @RequestParam float mt) {
        float ft = mt * 3.28f;

        model.addAttribute("ft", ft);
        model.addAttribute("mt", mt);
            
        return "converter";
    }
    
}
