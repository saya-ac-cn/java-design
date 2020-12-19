package ac.cn.saya.design.structure.adapter.objectadapter;


/**
 * @Title: VoltageAdapter
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/16 14:12
 * @Description: 适配器类
 */

public class VoltageAdapter implements Voltage5V{

    /**
     *  关联关系-聚合
     */
    private Voltage220V input;

    /**
     * 通过构造器，传入一个 Voltage220V 实例
     * @param input
     */
    public VoltageAdapter(Voltage220V input) {
        this.input = input;
    }

    @Override
    public int output5V() {
        // 获取 220V 电压
        int src = input.output220V();
        // 进行降压操作，适配成5V
        int dst = src / 44;
        return dst;
    }

}
