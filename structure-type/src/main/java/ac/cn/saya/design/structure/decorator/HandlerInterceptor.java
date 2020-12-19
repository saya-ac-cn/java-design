package ac.cn.saya.design.structure.decorator;

/**
 * @Title: HandlerInterceptor
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/17 16:32
 * @Description:
 */

public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handler);

}
