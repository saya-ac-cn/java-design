package ac.cn.saya.design.behavior.mediator;

/**
 * @Title: ClassLeader
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/26/20 20:35
 * @Description: 班委干部接口
 */

public abstract class ClassLeader {

    /**
     * 持有班长的引用
     */
    protected Mediator media;

    /**
     * 做自己的本职工作
     */
    public abstract void doWork();

    /**
     * 向班长发起请求
     */
    public abstract void sendRequest();

}
