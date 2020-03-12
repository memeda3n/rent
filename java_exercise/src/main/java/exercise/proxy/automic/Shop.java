package exercise.proxy.automic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/**
 * 动态代理实现AOP
 */
public class Shop implements InvocationHandler {

    private Object object;

    public Shop(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("来商店买东西");

        method.invoke(object,args);

        System.out.println("买完回去了");
        return null;
    }
}
