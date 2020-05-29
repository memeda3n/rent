package spring4_x.event_listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class MailEvent extends ApplicationContextEvent {

    private String to;

    public MailEvent(ApplicationContext source, String to) {
        super(source);
        this.to = to;
    }


    public String getTo() {
        return to;
    }
}
