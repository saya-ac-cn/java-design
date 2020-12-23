package ac.cn.saya.design.behavior.template;

/**
 * @Title: Client
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/23/20 21:59
 * @Description:
 */

public class Client {

    public static void main(String[] args) {
        System.out.println("----制作红豆豆浆----");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("----制作纯豆浆----");
        SoyaMilk peanutSoyaMilk = new CleanSoyaMilk();
        peanutSoyaMilk.make();
    }

}
