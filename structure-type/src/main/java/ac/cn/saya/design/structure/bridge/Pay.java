package ac.cn.saya.design.structure.bridge;

import java.math.BigDecimal;

/**
 * @Title: Pay
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/16 15:17
 * @Description: 支付渠道(支付宝&微信)
 */

public abstract class Pay {

    protected PayMode payMode;

    public Pay(PayMode payMode) {
        this.payMode = payMode;
    }

    /**
     * 用户交易
     * @param uuid 用户id
     * @param tradeId 订单号
     * @param ammount 交易金额
     * @return
     */
    public abstract String transfer(String uuid, String tradeId, BigDecimal ammount);

}
