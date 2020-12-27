package ac.cn.saya.design.behavior.memento;

/**
 * @Title: ConfigMemento
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/27/20 22:24
 * @Description: 备忘录类
 * 备忘录是对原有配置类的扩展，可以设置和获取配置信息。
 */

public class ConfigMemento {

    private ConfigFile configFile;

    public ConfigMemento(ConfigFile configFile) {
        this.configFile = configFile;
    }

    public ConfigFile getConfigFile() {
        return configFile;
    }

    public void setConfigFile(ConfigFile configFile) {
        this.configFile = configFile;
    }
}
