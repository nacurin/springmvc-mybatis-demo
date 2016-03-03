package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

import javax.annotation.Resource;

/**
 * Created by Roger on 2015/9/17.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public String getUser(Model model) {
        System.out.println(userService.selectAll().size());
        model.addAttribute("user", userService.selectAll());
        return "listUser";
    }
}