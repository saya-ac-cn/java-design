package ac.cn.saya.design.structure.adapter.interfaceadapter;

/**
 * @Title: AbstractEventHandler
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/16 14:51
 * @Description: 接口适配器，将EventHandler中的方法进行默认实现
 */

public abstract class AbstractEventHandler implements EventHandler {

    @Override
    public void click() {

    }

    @Override
    public void hover() {

    }

    @Override
    public void press() {

    }
}
