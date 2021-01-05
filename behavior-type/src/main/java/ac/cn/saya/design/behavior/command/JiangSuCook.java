package ac.cn.saya.design.behavior.command;

/**
 * @Title: JiangSuCook
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/23/20 22:35
 * @Description:
 */

public class JiangSuCook implements Cook {

    @Override
    public void doCooking() {
        System.out.println("江苏厨师，烹饪苏菜，宫廷第二大菜系，古今国宴上最受人欢迎的菜系。");
    }

}
