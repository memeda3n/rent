package spring4_x.event_listener;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "spring4_x.event_listener")
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class EventApplication {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(EventApplication.class, args);

        MailSender sender= context.getBean(MailSender.class);

        sender.sendMail("爱上看看");

    }

}
