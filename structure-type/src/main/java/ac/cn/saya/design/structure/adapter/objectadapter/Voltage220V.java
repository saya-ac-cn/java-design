package ac.cn.saya.design.structure.adapter.objectadapter;

/**
 * @Title: Voltage220V
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/16 14:11
 * @Description: 输出220V电压
 */

public class Voltage220V {

    /**
     * 被适配的类
     * @return
     */
    public int output220V(){
        int source = 220;
        System.out.println("电网提供市电，电压="+source+"V");
        return source;
    }

}
