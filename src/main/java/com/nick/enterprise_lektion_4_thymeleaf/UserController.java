package com.nick.enterprise_lektion_4_thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/user")
    public String userPage(Model userModel) {

        List<User> userList = new ArrayList<User>(
                List.of(
                        new User("Benny","123"),
                        new User("Frida","456"),
                        new User("Maskin","777")
                )
        );

        userModel.addAttribute("userList", userList);

        return "user";
    }
}
