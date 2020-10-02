package by.nagula.controller;

import by.nagula.service.exceptions.DuplicateUserException;
import by.nagula.service.exceptions.NoUserException;
import by.nagula.service.exceptions.WrongPasswordException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(DuplicateUserException.class)
    public String userContains(Model model, DuplicateUserException ex){
        model.addAttribute("message", ex.getMessage());
        return "registr";
    }

    @ExceptionHandler(WrongPasswordException.class)
    public String wrongPassword(Model model, WrongPasswordException ex){
        model.addAttribute("message1", ex.getMessage());
        return "auth";
    }

    @ExceptionHandler(NoUserException.class)
    public String wrongLogin(Model model, NoUserException ex){
        model.addAttribute("message2", ex.getMessage());
        return "auth";
    }
}
