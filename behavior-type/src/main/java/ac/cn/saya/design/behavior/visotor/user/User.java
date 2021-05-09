package ac.cn.saya.design.behavior.visotor.user;

import ac.cn.saya.design.behavior.visotor.visit.Visitor;

/**
 * @Title: User
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 1/5/21 22:35
 * @Description: 用户抽象类
 * 基础信息包括；姓名、身份、班级，也可以是一个业务用户属性类。
 * 定义抽象核心方法，abstract void accept(Visitor visitor)，这个方法是为了让后续的用户具体实现者都能提供出一个访问方法，共外部使用。
 */

public abstract class User {

    public String name;      // 姓名
    public String identity;  // 身份；重点班、普通班 | 特级教师、普通教师、实习教师
    public String clazz;     // 班级

    public User(String name, String identity, String clazz) {
        this.name = name;
        this.identity = identity;
        this.clazz = clazz;
    }

    // 核心访问方法
    public abstract void accept(Visitor visitor);

}
