package spring4_x.beanIife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

    private String brand;

    private String color;

    private int maxSpeed;

    private BeanFactory beanFactory;

    private String beanName;

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public String getBeanName() {
        return beanName;
    }

    public Car(){
        System.out.println("调用car（）构造函数");
    }

    public void setBrand(String brand){
        System.out.println("调用setBrand");
        this.brand=brand;
    }

    public void introduce(){
        System.out.println(brand+color+maxSpeed);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryAware.setBeanFactory()");
        this.beanFactory=beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("调用BeanNameAware.setBeanName()");
        this.beanName=beanName;
    }



    @Override
    public void destroy() throws Exception {
        System.out.println("调用DisposableBean.destroy方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitializingBean.afterPropertiesSet方法");
    }


    public void myInit(){
        System.out.println("调用myInit方法");
        this.maxSpeed=240;
    }

    public void myDestroy(){
        System.out.println("调用myDestroy方法");
    }

}
