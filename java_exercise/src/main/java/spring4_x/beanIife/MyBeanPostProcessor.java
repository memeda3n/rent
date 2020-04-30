package spring4_x.beanIife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {


    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if ("car".equals(beanName)) {
            Car car = (Car) bean;
            if (car.getColor() == null) {
                System.out.println("  BeanPostProcessor. postProcessBeforeInitialization");
                car.setColor("黑色");
            }
        }

        return bean;
    }


    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("car".equals(beanName)) {
            Car car = (Car) bean;
            if (car.getMaxSpeed()>200) {
                System.out.println("  BeanPostProcessor. postProcessAfterInitialization");
                car.setMaxSpeed(200);
            }
        }
        return bean;
    }

}
