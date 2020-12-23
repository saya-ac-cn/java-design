package ac.cn.saya.design.behavior.template;

/**
 * @Title: SoyaMilk
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/23/20 21:45
 * @Description: 抽象模板类，表示制作豆浆
 */

public abstract class SoyaMilk {

    /**
     * 模板方法定义成 final , 不让子类去覆盖.
     * 由于制作豆浆流程都由：1、选材料；2、加配料；3、浸泡；4、打碎。四个方法构成
     * 不同的豆浆制作工艺，都只是配料上的差异。
     * 但是制作流程都是固定的，因此可以抽象成一个模板
     */
    final void make(){
        select();
        if (customerWantCondiments()){
            addCondiments();
        }
        soak();
        beat();
    }

    /**
     * 选材料
     */
    void select() {
        System.out.println("第一步:选择好的新鲜黄豆 ");
    }

    /**
     * 添加不同的配料， 抽象方法, 子类具体实现
     */
    abstract void addCondiments();

    /**
     * 浸泡
     */
    void soak() {
        System.out.println("第三步:黄豆和配料开始浸泡， 需要 3 小时 ");
    }

    /**
     * 打碎
     */
    void beat() {
        System.out.println("第四步:黄豆和配料放到豆浆机去打碎 ");
    }

    /**
     * 钩子方法，决定是否需要添加配料
     */
    boolean customerWantCondiments() {
        System.out.println("------------");
        return true;
    }

}
