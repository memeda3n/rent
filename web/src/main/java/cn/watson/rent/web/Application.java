package cn.watson.rent.web;

import cn.watson.rent.web.config.ApplicationRequestInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "cn.watson.rent")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        ApplicationRequestInterceptor interceptor = context.getBean(ApplicationRequestInterceptor.class);
        System.out.println(interceptor);
    }
}
