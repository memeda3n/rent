package exercise.proxy.automic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {


    public static void main(String[] args) {
        Pot beer = new Pot();

        InvocationHandler lok = new Shop(beer);
        Product s=(Product)Proxy.newProxyInstance(beer.getClass().getClassLoader(),beer.getClass().getInterfaces(),lok);

        s.say("hello");

    }

}
