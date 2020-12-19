package ac.cn.saya.design.structure.adapter.classadapter;

/**
 * @Title: Client
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/16 13:52
 * @Description: 用户发起充电操作
 */

public class Client {

    public static void main(String[] args) {
        System.out.println("--------类适配器模式---------");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }

}
