package ac.cn.saya.design.behavior.visotor.user;

import ac.cn.saya.design.behavior.visotor.visit.Visitor;

/**
 * @Title: Student
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 1/5/21 22:43
 * @Description:
 */

public class Student extends User {

    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int ranking() {
        return (int) (Math.random() * 100);
    }

}
