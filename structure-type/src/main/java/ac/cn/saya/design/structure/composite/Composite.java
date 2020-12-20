package ac.cn.saya.design.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Composite
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/20/20 22:03
 * @Description: 树枝构件角色类（目录）
 */

public class Composite implements Component {

    /**
     * 存储组合对象中包含的子组件的对象（可能是目录也可能是文件）
     */
    private List<Component> childComponent = new ArrayList<>();

    /**
     * 组合对象的名称
     */
    private String name;


    /**
     * 构件名称
     * @param name
     */
    public Composite(String name) {
        this.name = name;
    }

    /**
     * 聚集管理方法，增加一个子构件对象
     * @param child 子构件对象
     */
    public void addChild(Component child){
        childComponent.add(child);
    }

    /**
     * 聚集管理方法，删除一个子构件对象
     * @param index 子构件对象的下标
     */
    public void removeChild(int index){
        childComponent.remove(index);
    }

    /**
     * 聚集管理方法，返回所有子构件对象
     */
    public List<Component> getChild(){
        return childComponent;
    }


    /**
     * 输出对象的自身结构
     * @param preStr 前缀，主要是按照层级拼接空格，实现向后缩进
     */
    @Override
    public void printStruct(String preStr) {
        // 先把自己输出
        System.out.println(preStr + "+" + this.name);
        //如果还包含有子组件，那么就输出这些子组件对象
        if(!childComponent.isEmpty()){
            //添加两个空格，表示向后缩进两个空格
            preStr += "  ";
            //输出当前对象的子对象
            for(Component c : childComponent){
                //递归输出每个子对象
                c.printStruct(preStr);
            }
        }
    }
}
