package com.diodi.service;

import com.diodi.domain.Student;

import java.util.List;

/**
 * @author diodi
 * @create 2021-04-06-21:37
 */
public interface StudentService {
    /**
     * 添加学生
     * @param student student对象
     * @return 成功返回1 否则返回0
     */
    int addStudent(Student student);

    /**
     * 查询学生列表
     * @return 学生列表
     */
    List<Student> findStudent();
}
