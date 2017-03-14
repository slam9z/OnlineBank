package com.userfront.controller;

import com.userfront.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by KozuePC on 3/10/2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "redirect:/index";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "signup";
    }
    @RequestMapping(value ="/signup", method = RequestMethod.POST)
    public String signupPost(@ModelAttribute("user") User user, Model model){

        return "signup";
    }
}
