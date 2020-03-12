package exercise.proxy.automic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {


    public static void main(String[] args) throws Exception {
        Pot beer = new Pot();

        System.setProperty("Dsun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        InvocationHandler lok = new Shop(beer);
        Product s = (Product) Proxy.newProxyInstance(beer.getClass().getClassLoader(), beer.getClass().getInterfaces(), lok);
        s.say("哈哈哈");

    }

}
