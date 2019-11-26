package cn.knowledge.learn.proxy.staticProxy;

public class Test {


    public static void main(String[] args) {
        Beer beer = new Beer();

        KLok lok = new KLok(beer);
        lok.consume();


    }

}
