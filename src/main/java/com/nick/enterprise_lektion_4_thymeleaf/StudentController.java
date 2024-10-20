package com.nick.enterprise_lektion_4_thymeleaf;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/student")
    public String studentPage(Model studentModel) {

        Student student = new Student("Benny", "Benny@bennysson.bennycom");

        studentModel.addAttribute("myStudent", student);
        return "student";
    }
}
