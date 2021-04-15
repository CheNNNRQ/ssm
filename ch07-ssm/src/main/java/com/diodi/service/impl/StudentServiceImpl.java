package com.diodi.service.impl;

import com.diodi.dao.StudentDao;
import com.diodi.domain.Student;
import com.diodi.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author diodi
 * @create 2021-04-06-21:41
 */
@Service
public class StudentServiceImpl implements StudentService {
    //引用类型自动注入 @autowired @resource
    @Resource
    private StudentDao studentDao;
    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> findStudent() {
        return studentDao.selectStudents();
    }
}
