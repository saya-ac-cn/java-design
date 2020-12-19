package ac.cn.saya.design.structure.bridge;

import java.math.BigDecimal;

/**
 * @Title: TencentPay
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/16 15:22
 * @Description: 支付宝
 */

public class AliPay extends Pay{

    public AliPay(PayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uuid, String tradeId, BigDecimal ammount) {
        System.out.println(String.format("模拟支付宝渠道支付划账开始。uuid：%s tradeId：%s amount：%s", uuid, tradeId, ammount.toEngineeringString()));
        boolean security = payMode.security(uuid);
        System.out.println(String.format("模拟支付宝渠道支付风控校验。uuid：%s tradeId：%s security：%s", uuid, tradeId, security));
        if (!security){
            System.out.println(String.format("模拟支付宝渠道支付划账拦截。uuid：%s tradeId：%s amount：%s", uuid, tradeId, ammount.toEngineeringString()));
            return "error";
        }
        System.out.println(String.format("模拟支付宝渠道支付划账成功。uuid：%s tradeId：%s amount：%s", uuid, tradeId, ammount.toEngineeringString()));
        return "success";
    }
}
