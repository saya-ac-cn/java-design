package ac.cn.saya.design.structure.decorator;

/**
 * @Title: Client
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/17 16:50
 * @Description: https://blog.51cto.com/lavasoft/90853
 * https://bugstack.cn/itstack-demo-design/2020/06/09/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E8%A3%85%E9%A5%B0%E5%99%A8%E6%A8%A1%E5%BC%8F.html
 */

public class Client {

    public static void main(String[] args) {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator(new SsoIntercepter());
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
        System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
    }

}
