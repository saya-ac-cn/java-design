package ac.cn.saya.design.behavior.memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Title: Administrator
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/27/20 22:31
 * @Description: 管理员
 */

public class Administrator {

    private int currentIndex = 0;

    /**
     * 当前系统已经升级的版本
     */
    private List<ConfigMemento> mementoList = new ArrayList<>();

    /**
     * 版本库
     */
    private Map<String,ConfigMemento> mementoMap = new HashMap<>();

    /**
     * 记录版本
     * @param memento
     */
    public void append(ConfigMemento memento){
        currentIndex = mementoList.isEmpty() ? 0 : currentIndex + 1;
        mementoList.add(memento);
        mementoMap.put(memento.getConfigFile().getVersionNo(),memento);
    }

    /**
     * 版本回滚到以前
     * @return
     */
    public ConfigMemento undo(){
        if ((currentIndex-1) <= 0){
            return mementoList.get(currentIndex=0);
        }
        currentIndex = currentIndex - 1;
        return mementoList.get(currentIndex);
    }

    /**
     * 版本返回
     * @return
     */
    public ConfigMemento redo(){
        if ((currentIndex+1) > mementoList.size()){
            return mementoList.get(currentIndex=(mementoList.size()-1));
        }
        currentIndex = currentIndex + 1;
        return mementoList.get(currentIndex);
    }

    /**
     * 获取指定版本信息
     * @param versionNo
     * @return
     */
    public ConfigMemento get(String versionNo){
        return mementoMap.get(versionNo);
    }

}
