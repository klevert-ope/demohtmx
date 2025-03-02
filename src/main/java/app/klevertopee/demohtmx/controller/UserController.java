package app.klevertopee.demohtmx.controller;

import app.klevertopee.demohtmx.model.User;
import app.klevertopee.demohtmx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String getUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @PostMapping
    public String addUser(@ModelAttribute User user, Model model) {
        userService.saveUser(user);
        model.addAttribute("users", userService.getAllUsers());
        return "userListFragment";
    }
}

