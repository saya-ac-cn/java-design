package ac.cn.saya.design.behavior.visotor;

import ac.cn.saya.design.behavior.visotor.user.Student;
import ac.cn.saya.design.behavior.visotor.user.Teacher;
import ac.cn.saya.design.behavior.visotor.user.User;
import ac.cn.saya.design.behavior.visotor.visit.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: DataView
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 1/5/21 22:53
 * @Description: 数据看版
 */

public class DataView {

    List<User> userList = new ArrayList<User>();

    public DataView() {
        userList.add(new Student("谢飞机", "重点班", "一年一班"));
        userList.add(new Student("windy", "重点班", "一年一班"));
        userList.add(new Student("大毛", "普通班", "二年三班"));
        userList.add(new Student("Shing", "普通班", "三年四班"));
        userList.add(new Teacher("BK", "特级教师", "一年一班"));
        userList.add(new Teacher("娜娜Goddess", "特级教师", "一年一班"));
        userList.add(new Teacher("dangdang", "普通教师", "二年三班"));
        userList.add(new Teacher("泽东", "实习教师", "三年四班"));
    }

    // 展示
    public void show(Visitor visitor) {
        for (User user : userList) {
            user.accept(visitor);
        }
    }

}
