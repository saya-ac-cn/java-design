package ac.cn.saya.design.structure.adapter.classadapter;

/**
 * @Title: VoltageAdapter
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/16 13:51
 * @Description: 适配器类
 */

public class VoltageAdapter extends Voltage220V implements Voltage5V{

    @Override
    public int output5V() {
        // 得到市电220V
        int src = output220V();
        // 进行降压操作，适配成5V
        int dst = src / 44;
        return dst;
    }
}
