package ac.cn.saya.design.structure.flyweight;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Title: ActivityFactory
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/17/20 23:03
 * @Description: 享元工厂
 */

public class ActivityFactory {

    static Map<Long,Activity> activityMap = new HashMap<Long, Activity>();

    public static Activity getActivity(long id){
        Activity activity = activityMap.get(id);
        if (null == activity){
            activity = new Activity();
            activity.setId(id);
            activity.setName("双12");
            activity.setDesc("年终大放送，满500减300");
            activity.setStartTime(new Date());
            activity.setStopTime(new Date());
            activityMap.put(id,activity);
        }
        return activity;
    }

}
