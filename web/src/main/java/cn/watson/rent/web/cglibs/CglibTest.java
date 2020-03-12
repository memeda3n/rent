package cn.watson.rent.web.cglibs;

import cn.watson.rent.web.Test;
import org.springframework.cglib.proxy.Enhancer;

public class CglibTest {


    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Test.class);
        enhancer.setCallback(new TargetInterceptor());
        Test test = (Test) enhancer.create();
        test.say();
        test.test();
    }



}
