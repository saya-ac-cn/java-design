package ac.cn.saya.design.behavior.mediator;

/**
 * @Title: Client
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/24/20 22:47
 * @Description: https://www.cnblogs.com/weekstart/p/10890186.html
 */

public class Client {

    public static void main(String[] args) {
        Mediator monitor = new ClassMonitor();
        LifeLeader lifeLeader = new LifeLeader(monitor);
        StudyLeader studyLeader = new StudyLeader(monitor);
        PhychologicalLeader phychologicalLeader = new PhychologicalLeader(monitor);
        //当前委员发送请求给班长然后通过班长与其他委员通信
        System.out.println("------生活委员->班长->心理委员------");
        lifeLeader.sendRequest();
        System.out.println("--------------------------");
        System.out.println("------学习委员->班长->心理委员,生活委员------");
        studyLeader.sendRequest();
        System.out.println("--------------------------");
        System.out.println("------心理委员->班长->生活委员------");
        phychologicalLeader.sendRequest();
        System.out.println("--------------------------");
    }

}
