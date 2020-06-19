package exercise.lock;

public class Consumer implements Runnable {


    Product product;

    public Consumer(Product product) {
        this.product = product;
    }


    public int consume() {
        return product.consume();
    }


    @Override
    public void run() {

    }
}
