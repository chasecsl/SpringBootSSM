package com.qf.springboot_ssm.service.impl;

import com.qf.springboot_ssm.dao.IStudentDao;
import com.qf.springboot_ssm.entity.Student;
import com.qf.springboot_ssm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther chase
 * @Time 2018/11/15 20:01
 * @Version 1.0
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDao studentDao;

    @Override
    public List<Student> queryAll() {
        return studentDao.queryAll();
    }

    @Override
    public int insertStudent(Student student) {
        return studentDao.insertStudent(student);
    }
}
