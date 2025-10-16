package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Student;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    private static List<Student> students = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("students", students);
        return "index";
    }

    @PostMapping("/agregar")
    public String agrega(@ModelAttribute Student student) {
        students.add(student);
        return "redirect:/";
    }

}