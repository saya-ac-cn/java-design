package ac.cn.saya.design.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: XiaoEr
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/23/20 22:38
 * @Description: 接收指令和下发指令
 */

public class XiaoEr {

    private List<Cuisine> cuisineList = new ArrayList<Cuisine>();

    /**
     * 点菜
     * @param cuisine
     */
    public void order(Cuisine cuisine) {
        cuisineList.add(cuisine);
    }

    /**
     * 下单
     */
    public synchronized void placeOrder() {
        for (Cuisine cuisine : cuisineList) {
            cuisine.cook();
        }
        cuisineList.clear();
    }


}
