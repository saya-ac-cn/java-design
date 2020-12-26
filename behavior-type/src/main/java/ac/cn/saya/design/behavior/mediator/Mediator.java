package ac.cn.saya.design.behavior.mediator;

/**
 * @Title: Mediator
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/26/20 20:32
 * @Description: 中介接口
 */

public interface Mediator {

    /**
     * 注册班委干部
     * @param name
     * @param c
     */
    public void register(String name,ClassLeader c);

    /**
     * 根据班委干部获得通知请求
     * @param name
     */
    public void command(String name);

}
