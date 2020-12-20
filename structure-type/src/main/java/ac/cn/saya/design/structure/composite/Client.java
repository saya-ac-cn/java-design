package ac.cn.saya.design.structure.composite;

import java.util.List;

/**
 * @Title: Client
 * @ProjectName java-design
 * @Description: TODO
 * @Author liunengkai
 * @Date: 12/20/20 22:13
 * @Description: 安全模式（客户端）
 * https://blog.csdn.net/u014727260/article/details/82722473
 */

public class Client {

    public static void main(String[] args) {
        Composite root = new Composite("/Users/saya");
        Composite desktop = new Composite("/desktop");
        Composite download = new Composite("/download");
        download.addChild(new Leaf("简历"));
        download.addChild(new Leaf("离职证明"));
        desktop.addChild(new Leaf("安装记录"));
        desktop.addChild(new Leaf("壁纸"));
        root.addChild(desktop);
        root.addChild(download);
        root.addChild(new Leaf("README.md"));
        root.printStruct("");

    }

}
