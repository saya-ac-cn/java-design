package ac.cn.saya.design.structure.bridge;

/**
 * @Title: FacePayMode
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/16 15:13
 * @Description: 刷脸支付
 */

public class FacePayMode implements  PayMode {

    @Override
    public boolean security(String uuid) {
        System.out.println("刷脸支付，风控校验脸部识别");
        return true;
    }
}
