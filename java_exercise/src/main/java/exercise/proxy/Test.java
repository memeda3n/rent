package exercise.proxy;


import exercise.proxy.staticProxy.Beer;
import exercise.proxy.staticProxy.KLok;

public class Test {


    public static void main(String[] args) {
        Beer beer = new Beer();

        KLok lok = new KLok(beer);
        lok.consume();

    }

}