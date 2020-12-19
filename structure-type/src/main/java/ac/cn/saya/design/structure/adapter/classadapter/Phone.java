package ac.cn.saya.design.structure.adapter.classadapter;

/**
 * @Title: Phone
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/16 13:51
 * @Description: 手机充电，发起调用
 */

public class Phone {

    public void charging(Voltage5V adpter){
        int src = adpter.output5V();
        if (5 == src){
            System.out.println("充电中，输入电压："+src+"V");
        }else {
            System.out.println("输入电压："+src+"V,如继续充电可能将损坏设备");
        }
    }

}
