package com.diodi.dao;

import com.diodi.domain.Student;

import java.util.List;

/**
 * @author diodi
 * @create 2021-04-06-21:15
 */
public interface StudentDao {
    /**
     * 添加学生方法
     * @param student 学生对象
     * @return 成功返回1 否则返回0
     */
    int insertStudent(Student student);

    /**
     * 返回学生列表
     * @return 学生列表
     */
    List<Student> selectStudents();
}
