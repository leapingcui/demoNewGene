package com.cy.module.submodule.mapper;

import com.cy.module.submodule.entity.Student;
import com.cy.module.submodule.entity.StudentExample;
import com.cy.module.submodule.entity.StudentMulti;
import com.cy.module.submodule.entity.StudentMultiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    int countMultiByExample(StudentMultiExample studentMultiExample);
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer stuId);

    int insert(Student record);

    int insertSelective(Student record);

    List<StudentMulti> selectMultiByExample(StudentMultiExample studentMultiExample);
    List<Student> selectByExample(StudentExample example);

    StudentMulti selectMultiByPrimaryKey(Integer stuId);
    Student selectByPrimaryKey(Integer stuId);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}