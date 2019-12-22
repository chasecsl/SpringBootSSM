package com.qf.springboot_ssm.controller;

import com.qf.springboot_ssm.entity.Student;
import com.qf.springboot_ssm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther chase
 * @Time 2018/11/15 19:47
 * @Version 1.0
 */
@Controller
@RequestMapping("/stu")
public class  StuController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("/list")
    public String stuList(Model model){
        List<Student> students = studentService.queryAll();
        model.addAttribute("students",students);
        return "studentlist";
    }

    @RequestMapping("/list/student")
    @ResponseBody
    public List<Student> studentList(){

        return studentService.queryAll();
    }
}
