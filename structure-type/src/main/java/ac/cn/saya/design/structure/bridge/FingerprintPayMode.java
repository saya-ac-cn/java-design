package ac.cn.saya.design.structure.bridge;

/**
 * @Title: FacePayMode
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/16 15:13
 * @Description: 指纹支付
 */

public class FingerprintPayMode implements  PayMode {

    @Override
    public boolean security(String uuid) {
        System.out.println("指纹支付，风控校验指纹识别");
        return true;
    }
}
