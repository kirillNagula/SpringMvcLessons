package by.nagula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/home")
public class CalcController {

    @GetMapping(path = "/calc")
    public String getPage(Model model){
        model.addAttribute("message");
       return "home";
    }

    @PostMapping(path = "/calc")
    public String calc(@RequestParam double num1, @RequestParam double num2, @RequestParam String type, Model model){
        switch (type){
            case "sum": model.addAttribute("message", "Результат сложения " + (num1 + num2));
                break;
            case "sub": model.addAttribute("message", "Результат вычитания " + (num1 - num2));
                break;
            case "mult": model.addAttribute("message", "Результат умножения " + num1 * num2);
                break;
            case "div": model.addAttribute("message", "Результат деления " + num1 / num2);
        }
        return "home";
    }
}
