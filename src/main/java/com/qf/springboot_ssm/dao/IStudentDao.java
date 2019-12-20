package com.qf.springboot_ssm.dao;

import com.qf.springboot_ssm.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther chase
 * @Time 2018/11/15 19:53
 * @Version 1.0
 */
@Mapper
public interface IStudentDao {

    /**
     * @return
     */
    List<Student> queryAll();

    int insertStudent(Student student);
}
