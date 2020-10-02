package by.nagula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/home")
public class LogoutController {

    @GetMapping(path = "/logout")
    public ModelAndView logOut(ModelAndView modelAndView, HttpSession session){
        session.invalidate();
        modelAndView.setViewName("redirect:/home/index");
        return modelAndView;
    }
}
