package ac.cn.saya.design.behavior.visotor.visit;

import ac.cn.saya.design.behavior.visotor.user.Student;
import ac.cn.saya.design.behavior.visotor.user.Teacher;

/**
 * @Title: Visitor
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 1/5/21 22:37
 * @Description: 访问数据接口
 */

public interface Visitor {

    // 访问学生信息
    void visit(Student student);

    // 访问老师信息
    void visit(Teacher teacher);

}
