package com.cy.module.submodule.mapper;

import com.cy.module.submodule.BaseTest;
import com.cy.module.submodule.entity.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/3/16.
 */
public class StudentMapperTest extends BaseTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testSelectMultiByExample() {
        Page<Object> page = PageHelper.startPage(2, 5);

        StudentMultiExample example = new StudentMultiExample();

        StudentExample studentExample = new StudentExample();
        studentExample.setOrderByClause("stu_id");
//        StudentExample.Criteria studentExampleCriteria = studentExample.createCriteria();
        ClassesExample classesExample = new ClassesExample();
//        ClassesExample.Criteria classesExampleCriteria = classesExample.createCriteria();

//        studentExampleCriteria.andStuNameLike("%二");
//        classesExampleCriteria.andClaIdEqualTo("1");

        example.setStudentExample(studentExample);
        example.setClassesExample(classesExample);

        List<StudentMulti> studentMultis = studentMapper.selectMultiByExample(example);

        PageInfo<StudentMulti> pageInfo = new PageInfo<StudentMulti>(studentMultis);
        long total = pageInfo.getTotal();
        System.out.println("总记录数：" + total);
        List<StudentMulti> list = pageInfo.getList();
        for ( StudentMulti studentMulti : list) {
            Student student = studentMulti.getStudent();
            Classes classes = studentMulti.getClasses();
            System.out.println("学生:" + student + "  " + "班级:" + classes);
        }
    }

    @Test
    public void testSelectByExample() {
        //如果是查询全部，将example置为null,如StudentExample example = null;
        StudentExample example = new StudentExample();
        example.setOrderByClause("stu_id");
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andStuNameLike("%二");
        List<Student> students = studentMapper.selectByExample(example);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void testSelectMultiByPrimaryKey() {
        StudentMulti studentMulti = studentMapper.selectMultiByPrimaryKey(102);
        System.out.println(studentMulti.getStudent());
        System.out.println(studentMulti.getClasses());
    }

    @Test
    public void testSelectByPrimaryKey() {
        Student student = studentMapper.selectByPrimaryKey(102);
        System.out.println(student);
    }

    @Test
    public void testDeleteByPrimaryKey() {
        studentMapper.deleteByPrimaryKey(188);
    }

    @Test
    public void testInsert() {
        Student student = new Student();
        student.setStuId(115);
        student.setStuPwd("115");
        student.setStuName("崔十五");
        student.setStuSex("女");
        student.setStuBirth(new Date());


        studentMapper.insert(student);
    }

    @Test
    public void testInsertSelective() {
        Student student = new Student();
        student.setStuId(116);
        student.setStuPwd("116");

        studentMapper.insertSelective(student);
    }

    @Test
    public void testCountMultiByExample() {

//        StudentMultiExample example = null;//多表不带条件共有多少条记录
        StudentMultiExample example = new StudentMultiExample();

        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria studentExampleCriteria = studentExample.createCriteria();
        studentExampleCriteria.andStuNameLike("%二");

        ClassesExample classesExample = new ClassesExample();
        ClassesExample.Criteria classesExampleCriteria = classesExample.createCriteria();
        classesExampleCriteria.andClaIdEqualTo("2");

        example.setStudentExample(studentExample);
        example.setClassesExample(classesExample);

        int i = studentMapper.countMultiByExample(example);
        System.out.println("共有记录:" + i + "条");
    }

    @Test
    public void testCountByExample() {

        StudentExample example = null;
        int i = studentMapper.countByExample(example);
        System.out.println("共有记录:" + i + "条");
    }

    @Test
    public void testUpdateByPrimaryKey() {
        Student student = new Student();
        student.setStuId(116);
        student.setStuPwd("116");
        student.setStuName("崔十六");
        student.setStuSex("女");
        student.setStuBirth(new Date());
//        student.setStuClaId("1");

        studentMapper.updateByPrimaryKey(student);
    }

    @Test
    public void testUpdateByPrimaryKeySelective() {
        Student student = new Student();
        student.setStuId(106);
        student.setStuPwd("106");

        studentMapper.updateByPrimaryKeySelective(student);
    }



}
