package ac.cn.saya.design.behavior.command;

/**
 * @Title: ShanDongCook
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/23/20 22:36
 * @Description:
 */

public class ShanDongCook implements Cook {

    @Override
    public void doCooking() {
        System.out.println("山东厨师，烹饪鲁菜，宫廷最大菜系，以孔府风味为龙头");
    }

}
