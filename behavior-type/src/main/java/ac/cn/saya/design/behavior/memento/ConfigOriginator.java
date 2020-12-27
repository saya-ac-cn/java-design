package ac.cn.saya.design.behavior.memento;

/**
 * @Title: ConfigOriginator
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/27/20 22:26
 * @Description: 记录者
 * 记录者类除了对ConfigFile配置类增加了获取和设置方法外，还增加了保存saveMemento()、获取getMemento(ConfigMemento memento)。
 * saveMemento：保存备忘录的时候会创建一个备忘录信息，并返回回去，交给管理者处理。
 * getMemento：获取的之后并不是直接返回，而是把备忘录的信息交给现在的配置文件this.configFile，这部分需要注意。
 */

public class ConfigOriginator {

    private ConfigFile configFile;

    public ConfigFile getConfigFile() {
        return configFile;
    }

    public void setConfigFile(ConfigFile configFile) {
        this.configFile = configFile;
    }

    /**
     * 保存备忘录
     * @return
     */
    public ConfigMemento saveMemento(){
        return new ConfigMemento(configFile);
    }

    public void getMemento(ConfigMemento memento){
        this.configFile = memento.getConfigFile();
    }

}
