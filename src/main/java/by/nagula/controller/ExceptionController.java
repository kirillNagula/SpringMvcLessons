package by.nagula.controller;

import by.nagula.service.exceptions.DuplicateUserException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler
    public String userContains(Model model, DuplicateUserException ex){
        model.addAttribute("message", ex.getMessage());
        return "registr";
    }
}
