package reflect;


import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

/**
 * 在 web模块下cglibs包内
 */
public class CglibTest {

    public static void main(String[] args) {

        BeforeAdvice advice = new GreetingAdvice();

        Waiter waiter = new Waiter();
        ProxyFactory factory = new ProxyFactory();
        factory.addAdvice(advice);
        factory.setTarget(waiter);

        Waiter waiter1 = (Waiter) factory.getProxy();
        waiter1.greetTo();
        waiter1.serveTo();
    }


    public static class GreetingAdvice implements MethodBeforeAdvice {

        @Override
        public void before(Method method, Object[] objects, Object o) throws Throwable {
            System.out.println("前置增强");
        }
    }


    public static class Waiter {
        public void greetTo() {
            System.out.println("欢迎光临");
        }

        public void serveTo(){
            System.out.println("很高兴为您服务");
        }
    }
}
