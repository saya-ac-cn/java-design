package ac.cn.saya.design.behavior.visotor.user;

import ac.cn.saya.design.behavior.visotor.visit.Visitor;

import java.math.BigDecimal;

/**
 * @Title: Teacher
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 1/5/21 22:41
 * @Description:
 */

public class Teacher extends User {

    public Teacher(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // 教师取得的升本率（被外界关注的信息）
    public double entranceRatio() {
        return BigDecimal.valueOf(Math.random() * 100).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
