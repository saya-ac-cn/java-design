package ac.cn.saya.design.behavior.command;

/**
 * @Title: ShanDongCuisine
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/23/20 22:28
 * @Description: 具体命令的实现（制作相应的菜品）
 */

public class ShanDongCuisine implements Cuisine {

    private Cook cook;

    public ShanDongCuisine(Cook cook) {
        this.cook = cook;
    }

    /**
     * 烹饪制作
     */
    @Override
    public void cook() {
        cook.doCooking();
    }
}
