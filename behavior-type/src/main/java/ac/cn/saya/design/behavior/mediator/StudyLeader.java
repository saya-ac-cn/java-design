package ac.cn.saya.design.behavior.mediator;

/**
 * @Title: StudyLeader
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/26/20 20:37
 * @Description: 生活委员
 */

public class StudyLeader extends ClassLeader {

    public StudyLeader(Mediator mediator) {
        media = mediator;
        media.register("StudyLeader",this);
    }

    /**
     * 做自己的本职工作
     */
    @Override
    public void doWork() {
        System.out.println("学习委员->小张最近成绩突飞猛进，果然在我的英明指导下没有人能不起飞!");
    }

    /**
     * 向班长发起请求
     */
    @Override
    public void sendRequest() {
        System.out.println("学习委员->小张为了成绩居然还搞抄袭，怎么变成这样了?班长大人快去通知生活委员和心理委员看看情况!");
        media.command("LifeLeader");
        media.command("phycologic");
    }
}
