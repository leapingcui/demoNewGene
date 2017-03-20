package com.cy.module.submodule.controller;

import com.cy.module.submodule.entity.Student;
import com.cy.module.submodule.entity.StudentMulti;
import com.cy.module.submodule.service.StudentService;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2017/3/18.
 */
@Controller
@RequestMapping("/studentController")
public class StudentController {

    private static final Logger logger = Logger.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping("/showAllStudents.do")
    public String showAllStudents(Model model,Integer pageNum,Integer pageSize) {
        logger.info("当前页：" + pageNum + " ============== " + "每页记录数：" + pageSize);
        PageInfo<StudentMulti> pageInfo = studentService.selectAllMulti(pageNum,pageSize);
        model.addAttribute("pageInfo", pageInfo);
        return "mainFrame";
    }

    @RequestMapping("/insertStudentUI.do")
    public String insertStudentUI(){
        return "module/submodule/insertStudent";
    }

    @RequestMapping("/insertStudent.do")
    public String insertStudent(Student student) {
        logger.info("接收到的student" + student);
        int num = studentService.insertSelective(student);
        logger.info("新增影响的行数:"+num);
        return "forward:showAllStudents.do";
    }

    @RequestMapping("/detailedStudent.do")
    public String detailedStudent(Model model, Integer stuId){
        StudentMulti studentMulti = studentService.selectMultiByPrimaryKey(stuId);
        model.addAttribute("studentMulti", studentMulti);
        return "module/submodule/detailedStudent";
    }

    @RequestMapping("/updateStudentUI.do")
    public String updateStudentUI(Model model, Integer stuId){
        logger.info("接收到的学号参数:" + stuId);
        Student student = studentService.selectByPrimaryKey(stuId);
        model.addAttribute("student", student);
        return "module/submodule/updateStudent";
    }

    @RequestMapping("/updateStudent.do")
    public String updateStudent(Student student){
        logger.info("接收到的学生" + student);
        studentService.updateByPrimaryKeySelective(student);
        return "forward:showAllStudents.do";
    }

    @RequestMapping("/deleteStudent.do")
    public String deleteStudent(Integer stuId){
        studentService.deleteByPrimaryKey(stuId);
        return "forward:showAllStudents.do";
    }

}
