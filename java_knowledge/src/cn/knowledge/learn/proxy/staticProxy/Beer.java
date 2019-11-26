package cn.knowledge.learn.proxy.staticProxy;

public class Beer implements Wine {
    @Override
    public void drink() {
        System.out.println("开酒");
    }

}
