package com.daimler.spring5_demo2.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *  xml 注入集合属性
 *  1. 创建类, 定义数组, list, map, set类型属性, 生成对应set方法
 *  2. 在spring配置文件中进行配置
 *  3.
 *  4. 在集合内设置对象类型值
 *  5. 把集合注入部分提取出来
 */
public class Stu {
    //1.  数组类型属性
    private String[] courses;

    //2.  list集合类型属性
    private List<String> list;

    //3. map集合类型属性
    private Map<String, String> maps;

    //4. set集合类型属性
    private Set<String> sets;

    //5. 学生所学多门课程
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void test(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courseList);
    }
}
