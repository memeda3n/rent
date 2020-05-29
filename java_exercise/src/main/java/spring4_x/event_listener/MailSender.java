package spring4_x.event_listener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MailSender implements ApplicationContextAware {

    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }

    public void sendMail(String to) {
        System.out.println("MailSender:模拟发送邮件");
        MailEvent event = new MailEvent(this.ctx, to);
        ctx.publishEvent(event);
    }


}
