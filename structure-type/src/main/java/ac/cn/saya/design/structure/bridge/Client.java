package ac.cn.saya.design.structure.bridge;

import java.math.BigDecimal;

/**
 * @Title: Client
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/16 15:32
 * @Description: 客户端
 */

public class Client {

    public static void main(String[] args) {
        System.out.println("\r\n模拟测试场景；微信支付、密码方式。");
        Pay tencentPay = new TencentPay(new CypherPayMode());
        tencentPay.transfer("wx101010","23456789045678", BigDecimal.ONE);
        System.out.println("\r\n模拟测试场景；支付宝、人脸方式。");
        Pay aliPay = new AliPay(new FingerprintPayMode());
        aliPay.transfer("67889789","23456789042345623478", BigDecimal.ONE);
    }

}
