package ac.cn.saya.design.structure.flyweight;

/**
 * @Title: Client
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/17/20 23:16
 * @Description:
 */

public class Client {

    private static ActivityController activityController = new ActivityController();


    public static void main(String[] args) throws InterruptedException {
        for (int idx = 0; idx < 10; idx++) {
            Long req = 10001L;
            Activity activity = activityController.queryActivityInfo(req);
            System.out.println(String.format("测试结果：%s %s", req, activity.toString()));
            Thread.sleep(1200);
        }
    }

}
