package ac.cn.saya.design.behavior.template;

/**
 * @Title: CleanSoyaMilk
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/23/20 21:56
 * @Description:
 */

public class CleanSoyaMilk extends SoyaMilk {

    /**
     * 添加不同的配料， 抽象方法, 子类具体实现
     */
    @Override
    void addCondiments() {

    }

    /**
     * 钩子方法，决定是否需要添加配料
     */
    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
