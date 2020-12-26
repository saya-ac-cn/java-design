package ac.cn.saya.design.behavior.mediator;

/**
 * @Title: LifeLeader
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/26/20 20:37
 * @Description: 生活委员
 */

public class LifeLeader extends ClassLeader {

    public LifeLeader(Mediator mediator) {
        media = mediator;
        media.register("LifeLeader",this);
    }

    /**
     * 做自己的本职工作
     */
    @Override
    public void doWork() {
        System.out.println("生活委员->小张最近生活作风有点问题，需要我的帮助!");
    }

    /**
     * 向班长发起请求
     */
    @Override
    public void sendRequest() {
        System.out.println("生活委员->小张是不是有什么精神负担，班长大人去叫心理委员去看看什么情况吧!");
        media.command("phycologic");
    }
}
