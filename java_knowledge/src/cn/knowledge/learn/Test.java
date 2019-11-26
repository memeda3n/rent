package cn.knowledge.learn;

import cn.knowledge.learn.proxy.staticProxy.Beer;
import cn.knowledge.learn.proxy.staticProxy.KLok;

public class Test {


    public static void main(String[] args) {
        Beer beer = new Beer();

        KLok lok = new KLok(beer);
        lok.consume();


    }

}
