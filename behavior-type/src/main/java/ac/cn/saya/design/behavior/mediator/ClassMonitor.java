package ac.cn.saya.design.behavior.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title: ClassMonitor
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/26/20 20:47
 * @Description:
 */

public class ClassMonitor implements Mediator {

    /**
     * 利用map集合存放学委的相关属性
     */
    private Map<String, ClassLeader> map = new HashMap<String, ClassLeader>();

    /**
     * 注册班委干部
     *
     * @param name
     * @param c
     */
    @Override
    public void register(String name, ClassLeader c) {
        map.put(name, c);
    }

    /**
     * 根据班委干部获得通知请求
     *
     * @param name
     */
    @Override
    public void command(String name) {
        map.get(name).doWork();
    }
}
