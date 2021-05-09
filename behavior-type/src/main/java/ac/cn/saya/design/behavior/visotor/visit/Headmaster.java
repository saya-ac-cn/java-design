package ac.cn.saya.design.behavior.visotor.visit;

import ac.cn.saya.design.behavior.visotor.user.Student;
import ac.cn.saya.design.behavior.visotor.user.Teacher;

/**
 * @Title: Headmaster
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 1/5/21 22:45
 * @Description: 访问者：校长。关注；学生的名称和班级，老师对这个班级的升学率
 */

public class Headmaster implements Visitor{

    @Override
    public void visit(Student student) {
        System.out.println(String.format("学生信息 姓名：%s 班级：%s",student.name, student.clazz));
    }

    @Override
    public void visit(Teacher teacher) {
        System.out.println(String.format("学生信息 姓名：%s 班级：%s 升学率：%s", teacher.name, teacher.clazz, teacher.entranceRatio()));
    }
}
