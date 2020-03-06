package cn.watson.rent.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * WebMvcConfigurationSupport 和WebMvcConfigurer一起使用，WebMvcConfigurer会不起作用
 */
@Configuration
public class WebConfigTest extends WebMvcConfigurationSupport {


    @Bean
    public ApplicationRequestInterceptor requestInterceptor() {
        return new ApplicationRequestInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        //注册TestInterceptor拦截器
//        InterceptorRegistration registration = registry.addInterceptor(requestInterceptor());
//        registration.addPathPatterns("/**");                      //所有路径都被拦截
    }
}
