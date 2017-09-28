package com.firstapp.firstapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    Student michelle = new Student("Michelle", "Mangan", Grade.Eighth);

    @GetMapping("/new_student")
    public String newStudent(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("grades", Grade.values());
        return "new_student";
    }

    @PostMapping("/create_student")
    public String createStudent(@ModelAttribute Student student) {
        return "view_student";
    }
}