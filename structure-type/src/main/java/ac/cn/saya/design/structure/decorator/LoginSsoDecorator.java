package ac.cn.saya.design.structure.decorator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Title: LoginSsoDecorator
 * @ProjectName java-design
 * @Description: TODO
 * @Author Pandora
 * @Date: 2020/12/17 16:44
 * @Description:
 */

public class LoginSsoDecorator extends SsoDecorator {

    private static Map<String, String> authMap = new ConcurrentHashMap<String, String>();

    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("doudou", "queryUserInfo");
    }

    public LoginSsoDecorator(HandlerInterceptor handlerInterceptor) {
        super(handlerInterceptor);
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        boolean flag = super.preHandle(request, response, handler);
        if (!flag){
            return false;
        }
        String user = request.substring(8);
        String method = authMap.get(user);
        System.out.println(String.format("模拟单点登录方法访问拦截校验：%s %s", user, method));
        return "queryUserInfo".equals(method);
    }
}
