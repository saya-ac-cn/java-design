package ac.cn.saya.design.structure.flyweight;

import java.util.Date;

/**
 * @Title: Activity
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/17/20 23:00
 * @Description:  活动信息
 */

public class Activity {

    private Long id;        // 活动ID
    private String name;    // 活动名称
    private String desc;    // 活动描述
    private Date startTime; // 开始时间
    private Date stopTime;  // 结束时间
    private Stock stock;    // 活动库存

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", name:'" + name + '\'' +
                ", desc:'" + desc + '\'' +
                ", startTime:" + startTime +
                ", stopTime:" + stopTime +
                ", stock:" + stock +
                '}';
    }
}
