package ac.cn.saya.design.structure.decorator;

/**
 * @Title: SsoIntercepter
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/17 16:55
 * @Description:
 */

public class SsoIntercepter implements HandlerInterceptor {

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        String ticket = request.substring(1, 8);
        return ticket.equals("success");
    }
}
