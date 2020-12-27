package ac.cn.saya.design.behavior.memento;

import java.util.Date;

/**
 * @Title: Client
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/27/20 22:32
 * @Description:
 */

public class Client {

    public static void main(String[] args) {
        Administrator administrator = new Administrator();
        ConfigOriginator configOriginator = new ConfigOriginator();
        configOriginator.setConfigFile(new ConfigFile("V1.2.0", "增加财政管理模块", new Date(), "shmily"));
        // 保存配置
        administrator.append(configOriginator.saveMemento());
        configOriginator.setConfigFile(new ConfigFile("V1.2.1", "修改登录bug", new Date(), "shmily"));
        // 保存配置
        administrator.append(configOriginator.saveMemento());
        configOriginator.setConfigFile(new ConfigFile("V1.3.0", "增加账单查看", new Date(), "shmily"));
        // 保存配置
        administrator.append(configOriginator.saveMemento());
        configOriginator.setConfigFile(new ConfigFile("V1.3.1", "增加日志查看", new Date(), "shmily"));
        // 保存配置
        administrator.append(configOriginator.saveMemento());

        // 历史配置(回滚)
        configOriginator.getMemento(administrator.undo());
        System.out.println(String.format("历史配置(回滚)undo：%s", configOriginator.getConfigFile()));

        // 历史配置(再回滚)
        configOriginator.getMemento(administrator.undo());
        System.out.println(String.format("历史配置(回滚)undo：%s", configOriginator.getConfigFile()));

        // 历史配置(前进)
        configOriginator.getMemento(administrator.redo());
        System.out.println(String.format("历史配置(前进)redo：%s", configOriginator.getConfigFile()));

        // 历史配置(获取)
        configOriginator.getMemento(administrator.get("V1.3.0"));
        System.out.println(String.format("历史配置(获取)get：%s", configOriginator.getConfigFile()));
    }

}
