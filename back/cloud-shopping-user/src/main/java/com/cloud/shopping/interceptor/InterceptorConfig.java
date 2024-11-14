package com.cloud.shopping.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    //自定义的拦截器对象
    @Autowired
    private LoginInterceptor loginInterceptor;
    @Autowired
    private AuthInterceptor authInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册自定义拦截器对象
        /**
         * <!--用户登录拦截-->
         *         <mvc:interceptor>
         *             <mvc:mapping path="/user/*" />
         *             <mvc:mapping path="/order/*"/>
         *             <mvc:exclude-mapping path="/user/findpassword" />
         *             <mvc:exclude-mapping path="/user/sendfetchpwdmail" />
         *             <bean class="cn.cie.interceptor.LoginInterceptor" />
         *         </mvc:interceptor>
         */
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/user/*", "") //设置拦截器拦截的请求路径
                .excludePathPatterns("/user/findpassword", "/user/sendfetchpwdmail");//设置不拦截的请求路径
        registry.addInterceptor(authInterceptor)
                .addPathPatterns("/**"); // 设置拦截器拦截的请求路径
    }
}
