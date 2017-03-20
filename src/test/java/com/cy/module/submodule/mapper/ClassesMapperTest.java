package com.cy.module.submodule.mapper;

import com.cy.module.submodule.BaseTest;
import com.cy.module.submodule.entity.Classes;
import com.cy.module.submodule.entity.ClassesExample;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/3/16.
 */
public class ClassesMapperTest extends BaseTest {

    @Autowired
    private ClassesMapper classesMapper;

    @Test
    public void testSelectByExample() {
        ClassesExample example = new ClassesExample();
/*
//        例子来自官方文档
        ClassesExample.Criteria or = example.or();
        example.or()
                .andField1EqualTo(5)
                .andField2IsNull();

        example.or()
                .andField3NotEqualTo(9)
                .andField4IsNotNull();

        List<Integer> field5Values = new ArrayList<Integer>();
        field5Values.add(8);
        field5Values.add(11);
        field5Values.add(14);
        field5Values.add(22);

        example.or()
                .andField5In(field5Values);

        example.or()
                .andField6Between(3, 7);

        where (field1 = 5 and field2 is null)
        or (field3 <> 9 and field4 is not null)
        or (field5 in (8, 11, 14, 22))
        or (field6 between 3 and 7)
*/
        ClassesExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("cla_num");
        criteria.andClaNameLike("三%");
        List<Classes> classesList = classesMapper.selectByExample(example);//若是全部查询不需要example创建Criteria
        for (Classes classes : classesList) {
            System.out.println(classes);
        }
    }

    @Test
    public void testSelectByPrimaryKey() {
        Classes classes = classesMapper.selectByPrimaryKey("1");
        System.out.println(classes);
    }




}
