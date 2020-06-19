package exercise.lock;

public class Product {

    public int num;


    public int produce() {
        return 20 + num;
    }


    public int consume() {
        return --num;
    }

}
