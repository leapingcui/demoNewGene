package com.cy.module.submodule.service;

import com.cy.module.submodule.entity.Student;
import com.cy.module.submodule.entity.StudentMulti;

import java.util.List;

/**
 * Created by Administrator on 2017/3/18.
 */
public interface StudentService {

    List<StudentMulti> selectAllMulti();

    int insertSelective(Student record);

    StudentMulti selectMultiByPrimaryKey(Integer stuId);

    Student selectByPrimaryKey(Integer stuId);

    int updateByPrimaryKeySelective(Student record);

    int deleteByPrimaryKey(Integer stuId);

}
