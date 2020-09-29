package by.nagula.controller;

import by.nagula.entity.User;
import by.nagula.service.UserService;
import by.nagula.service.exceptions.WrongPasswordException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/home")
public class RegistrationController {
    private UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/auth")
    public ModelAndView authorization(ModelAndView modelAndView){
        modelAndView.setViewName("auth");
        return modelAndView;
    }

    @PostMapping(path = "/auth")
    public ModelAndView addAuthorization(ModelAndView modelAndView, HttpSession httpSession, User user){
        System.out.println("User после регистрации" + user);
        User user1 = userService.showByLogin(user.getLogin());
        if (user.getPassword().equals(user1.getPassword())){
            httpSession.setAttribute("user", user1);
            modelAndView.setViewName("index");
        } else{
            throw new WrongPasswordException();
        }
        return modelAndView;
    }

    @GetMapping(path = "/registr")
    public ModelAndView registration(ModelAndView modelAndView){
        modelAndView.setViewName("registr");
        return modelAndView;
    }

    @PostMapping(path = "/registr")
    public ModelAndView addRegistration(User user, ModelAndView modelAndView){
        System.out.println(user);
        userService.createUser(user);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
