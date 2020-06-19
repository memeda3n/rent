package exercise.lock;

public class Produce implements Runnable {


    Product product;

    public Produce(Product product) {
        this.product = product;
    }


    public int produce() {
        return product.produce();
    }

    @Override
    public void run() {
        synchronized (product) {
            while (product.num < 10) {
                product.produce();
            }
        }
    }
}
