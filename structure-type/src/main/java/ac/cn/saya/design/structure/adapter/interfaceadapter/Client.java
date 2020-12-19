package ac.cn.saya.design.structure.adapter.interfaceadapter;

/**
 * @Title: Client
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/16 14:54
 * @Description: 发起调用者
 */

public class Client {

    public static void main(String[] args) {
        AbstractEventHandler eventHandler = new AbstractEventHandler(){
            @Override
            public void click(){
                System.out.println("重写单击事件");
            }
        };
        eventHandler.click();
    }

}
