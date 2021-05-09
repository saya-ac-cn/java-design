package ac.cn.saya.design.behavior.visotor.visit;

import ac.cn.saya.design.behavior.visotor.user.Student;
import ac.cn.saya.design.behavior.visotor.user.Teacher;

/**
 * @Title: Parent
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 1/5/21 22:49
 * @Description: 访问者：家长。关注；自己家孩子的排名，老师的班级和教学水平
 */

public class Parent implements Visitor {

    @Override
    public void visit(Student student) {
        System.out.println(String.format("学生信息 姓名：%s 班级：%s 排名：%s", student.name, student.clazz, student.ranking()));
    }

    @Override
    public void visit(Teacher teacher) {
        System.out.println(String.format("老师信息 姓名：%s 班级：%s 级别：%s", teacher.name, teacher.clazz, teacher.identity));
    }
}
