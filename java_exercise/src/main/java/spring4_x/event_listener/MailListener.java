package spring4_x.event_listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MailListener implements ApplicationListener<MailEvent> {

    @Override
    public void onApplicationEvent(MailEvent event) {
        MailEvent mailEvent=event;
        System.out.println("MailListener"+mailEvent.getTo()+"发送一封邮件");
    }

}
