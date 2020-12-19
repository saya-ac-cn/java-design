package ac.cn.saya.design.structure.bridge;

/**
 * @Title: PayMode
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/16 15:12
 * @Description: 支付方式接口
 */

public interface PayMode {

    public boolean security(String uuid);

}
