package ac.cn.saya.design.behavior.command;

/**
 * @Title: GuangDongCuisine
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/23/20 22:28
 * @Description: 具体命令的实现（制作相应的菜品）
 */

public class GuangDongCuisine implements Cuisine {

    private Cook cook;

    public GuangDongCuisine(Cook cook) {
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
