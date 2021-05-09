package ac.cn.saya.design.behavior.visotor;

import ac.cn.saya.design.behavior.visotor.visit.Headmaster;
import ac.cn.saya.design.behavior.visotor.visit.Parent;

/**
 * @Title: Client
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 1/5/21 22:56
 * @Description:
 */

public class Client {

    public static void main(String[] args) {
        DataView dataView = new DataView();

        System.out.println("\r\n家长视角访问：");
        dataView.show(new Parent());     // 家长

        System.out.println("\r\n校长视角访问：");
        dataView.show(new Headmaster());  // 校长
    }

}
