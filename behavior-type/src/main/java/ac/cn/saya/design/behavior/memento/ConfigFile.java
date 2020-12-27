package ac.cn.saya.design.behavior.memento;

import java.util.Date;

/**
 * @Title: ConfigFile
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/27/20 22:20
 * @Description: 配置文件信息类
 * 配置类可以是任何形式的，这里只是简单的描述了一个基本的配置内容信息
 */

public class ConfigFile {

    /**
     * 版本号
     */
    private String versionNo;

    /**
     * neir
     */
    private String content;

    /**
     * 时间
     */
    private Date dataTime;

    /**
     * 操作人
     */
    private String operator;

    public ConfigFile(String versionNo, String content, Date dataTime, String operator) {
        this.versionNo = versionNo;
        this.content = content;
        this.dataTime = dataTime;
        this.operator = operator;
    }

    public ConfigFile(String content) {
        this.content = content;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "{" +
                "versionNo：'" + versionNo + '\'' +
                ", content：'" + content + '\'' +
                ", dataTime：" + dataTime +
                ", operator：'" + operator + '\'' +
                '}';
    }
}
