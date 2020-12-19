package ac.cn.saya.design.structure.bridge;

/**
 * @Title: FacePayMode
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/16 15:13
 * @Description: 密码支付
 */

public class CypherPayMode implements  PayMode {

    @Override
    public boolean security(String uuid) {
        System.out.println("密码支付，风控校验密码识别");
        return true;
    }
}
