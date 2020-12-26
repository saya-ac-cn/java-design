package ac.cn.saya.design.behavior.mediator;

/**
 * @Title: PhychologicalLeader
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/26/20 20:37
 * @Description: 生活委员
 */

public class PhychologicalLeader extends ClassLeader {

    public PhychologicalLeader(Mediator mediator) {
        media = mediator;
        media.register("phycologic",this);
    }

    /**
     * 做自己的本职工作
     */
    @Override
    public void doWork() {
        System.out.println("心理委员->小张最近心情好像不太好，需要我的帮助!");
    }

    /**
     * 向班长发起请求
     */
    @Override
    public void sendRequest() {
        System.out.println("心理委员->小张是不是生活上有什么问题，班长大人叫生活委员多关注一下吧!");
        media.command("LifeLeader");
    }
}
