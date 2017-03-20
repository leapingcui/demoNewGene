package com.cy.module.submodule.service.impl;

import com.cy.module.submodule.entity.*;
import com.cy.module.submodule.mapper.StudentMapper;
import com.cy.module.submodule.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/3/18.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public PageInfo<StudentMulti> selectAllMulti(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        StudentMultiExample example = new StudentMultiExample();
        StudentExample studentExample = new StudentExample();
        studentExample.setOrderByClause("stu_id");
        ClassesExample classesExample = new ClassesExample();
        example.setStudentExample(studentExample);
        example.setClassesExample(classesExample);
        List<StudentMulti> studentMultis = studentMapper.selectMultiByExample(example);
        PageInfo<StudentMulti> pageInfo = new PageInfo<StudentMulti>(studentMultis);
        return pageInfo;
    }

    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    public StudentMulti selectMultiByPrimaryKey(Integer stuId) {
        return studentMapper.selectMultiByPrimaryKey(stuId);
    }

    public Student selectByPrimaryKey(Integer stuId) {
        return studentMapper.selectByPrimaryKey(stuId);
    }

    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    public int deleteByPrimaryKey(Integer stuId) {
        return studentMapper.deleteByPrimaryKey(stuId);
    }

}
