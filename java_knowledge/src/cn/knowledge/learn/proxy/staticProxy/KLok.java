package cn.knowledge.learn.proxy.staticProxy;

public class KLok {

    Wine wine;

    public KLok(Wine wine) {
        this.wine = wine;
    }
    public void consume(){
        System.out.println("开始消费");
        wine.drink();
        System.out.println("消费结束");
    }

}
