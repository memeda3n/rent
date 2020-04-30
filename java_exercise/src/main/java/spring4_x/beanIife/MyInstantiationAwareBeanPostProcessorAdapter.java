package spring4_x.beanIife;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

public class MyInstantiationAwareBeanPostProcessorAdapter extends InstantiationAwareBeanPostProcessorAdapter {

    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {

        if ("car".equals(beanName)){
            System.out.println("InstantiationAwareBeanPostProcessorAdapter postProcess Before Instantiation");
        }

        return null;
    }


    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if ("car".equals(beanName)){
            System.out.println(" InstantiationAwareBeanPostProcessorAdapter postProcess After Instantiation");
        }
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(
            PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {

        if ("car".equals(beanName)){
            System.out.println("InstantiationAwareBeanPostProcessorAdapter postProcess Property Values");
        }

        return pvs;
    }
}
