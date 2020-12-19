package ac.cn.saya.design.structure.facade;

/**
 * @Title: BootStart
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/18/20 21:07
 * @Description: 外观角色
 * http://c.biancheng.net/view/1369.html
 */

public class BootStart {

    public static void boot(){
        System.out.println("--------设备正在进行自检---------");
        ElectricCircuitSystem.check();
        BrakingSystem.check();
        OilWaySystem.check();
        SteeringSystem.check();
        System.out.println("--------设备完成进行自检---------");
    }

}
