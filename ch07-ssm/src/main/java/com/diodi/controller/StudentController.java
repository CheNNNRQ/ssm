package com.diodi.controller;

import com.diodi.domain.Student;
import com.diodi.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author diodi
 * @create 2021-04-06-21:52
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService service;
    /**
     *  注册学生
     */
    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student){
        ModelAndView mv = new ModelAndView();
        String tips = "注册失败";
        //调用service处理Student
        int nums = service.addStudent(student);
        if(nums>0) {
            //注册成功
            tips ="学生[" +student.getName()+ "]注册成功";
        }
        //添加数据
        mv.addObject("tips", tips);
        //返回结果页面
        mv.setViewName("result");
        return mv;
    }

    /**
     * 处理查询 响应ajax
     * @return
     */
    @RequestMapping("/queryStudent.do")
    @ResponseBody //返回一个json
    public List<Student> queryStudent(){
        List<Student> student = service.findStudent();
        return student;
    }
}
