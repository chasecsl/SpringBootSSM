package com.qf.springboot_ssm.service;

import com.qf.springboot_ssm.entity.Student;

import java.util.List;

/**
 * @Auther chase
 * @Time 2018/11/15 19:58
 * @Version 1.0
 */
public interface IStudentService {

    List<Student> queryAll();

    int insertStudent(Student student);
}
